package tddc77.yahtzee;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Törnblom (johto012), Mikael Silvén (miksi016)
 */
public class Player implements Comparable<Player>
{

    public static final String SCORE_PROPERTY = "Score";
    public static final String TOTAL_SCORE_PROPERTY = "TotalScore";
    public static final String LEFT_FOR_BONUS_PROPERTY = "LeftForBonus";
    private final String name;
    private List<Score> scores;
    private PropertyChangeSupport prop;
    private int leftForBonus;
    private final boolean computer;

    /**
     * The new player to be created. He needs a name and he needs to know
     * if he's a computer or not.
     *
     * @param name
     * @param computer
     */
    public Player(String name, boolean computer)
    {
        scores = new ArrayList<Score>();
        prop = new PropertyChangeSupport(this);
        leftForBonus = ScoreFactory.SCORE_BONUS_LIMIT;
        this.name = name;
        this.computer = computer;
    }

    //TODO: javadoc
    public void addPropertyChangeListener(PropertyChangeListener l)
    {
        prop.addPropertyChangeListener(l);
    }

    //TODO: javadoc
    public void removePropertyChangeListener(PropertyChangeListener l)
    {
        prop.removePropertyChangeListener(l);
    }

    /**
     * gets the amount of points the player needs to acheive bonus.
     *
     * @return int How much more points the players need for the bonus score.
     */
    public int getLeftForBonus()
    {
        return leftForBonus;
    }

    /**
     * Is the player a computer?
     *
     * @return true/false if the player is a computer or not.
     */
    public boolean isComputer()
    {
        return computer;
    }

    /**
     * Sets the number of scores that the player needs to acheive the bonus 
     * score. If the amount differs from the old, a LEFT_FOR_BONUS_PROPERTY
     * changce event is fired.
     * 
     * @param leftForBonus the new amount of points needed to acheive bonus
     */
    public void setLeftForBonus(int leftForBonus)
    {
        int oldValue = this.leftForBonus;
        this.leftForBonus = leftForBonus;
        prop.firePropertyChange(LEFT_FOR_BONUS_PROPERTY, oldValue,
                leftForBonus);
    }

    /**
     * Gets the name of the player
     *
     * @return String the name of the player.
     */
    public String getName()
    {
        return name;
    }

    /**
     * gets the players name as a string.
     * If the player is a CPU, the tag "CPU" is added next to his name.
     *
     * @return String the name of the player.
     */
    @Override
    public String toString()
    {
        if (isComputer())
        {
            return getName() + " (CPU)";
        }
        return getName();
    }

    /**
     * Adds a new score to the players scoreboard.
     * If the score is new, its added to the scoreboard,
     * a SCORE_PROPERTY change event is fired together with a
     * TOTAL_SCORE_PROPERTY change event if the total score was affected.
     *
     * @param s the new Score to be added.
     */
    public void addScore(Score s)
    {
        if (!scores.contains(s))
        {
            int oldTotalScore = getTotalScore();
            scores.add(s);
            prop.firePropertyChange(SCORE_PROPERTY, null, s);
            if (s.getValue() > 0)
            {
                prop.firePropertyChange(TOTAL_SCORE_PROPERTY, oldTotalScore,
                        getTotalScore());
            }
        }
    }

    /**
     * Calculates and returns the total score of the player.
     *
     * @return int the total score of the player so far.
     */
    public int getTotalScore()
    {
        int ret = 0;
        for (Score s : scores)
        {
            ret += s.getValue();
        }
        return ret;
    }

    /**
     * Gets the list with the players used scores.
     *
     * @return List A list with the players scores.
     */
    public List<Score> getScores()
    {
        return scores;
    }

    /**
     * Compares another player to this one by subtracting the other players
     * score with this players score. If the other player was deemed greater, a
     * positive is returned, a negative number if the current player was greater
     * and zero if they were equal.
     *
     * @param that The Player to compare with
     * @return A negative number if this player is greater, zero if
     * they are egual and a positive number is the other player is greater.
     */
    public int compareTo(Player that)
    {
        return that.getTotalScore() - this.getTotalScore();
    }
}
