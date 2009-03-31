package tddc77.yahtzee;

/**
 *
 * @author John Törnblom (johto012), Mikael Silvén (miksi016)
 */
public class HighScore implements Comparable<HighScore>
{
    private String name;
    private int score;


    /**
     * gets the name of the person in the highscore.
     *
     * @return the name of the person on the highscore
     */
    public String getName()
    {
        return name;
    }

    /**
     * sets the score of a player in the highscore.
     * @param score the score to be recorded.
     */
    public void setScore(int score)
    {
        this.score = score;
    }

    /**
     * sets the name of a player in the highscore
     * @param name the players name to be recorded.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * gets the score of a player in the highscore list
     *
     * @return int the score of the recordec player.
     */
    public int getScore()
    {
        return score;
    }

    /**
     * Compares two highscore objects to determine which was the higest.
     *
     * @param that the other highscore to compare with.
     * @return A negative number if this highscore is higher, zero if
     * they are equal and a positive number if that highscore was higher.
     */
    public int compareTo(HighScore that)
    {
        return that.getScore() - this.getScore();
    }
}
