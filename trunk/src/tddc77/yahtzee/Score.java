package tddc77.yahtzee;

/**
 *
 * @author John Törnblom (johto012), Mikael Silvén (miksi016)
 */
public abstract class Score implements Comparable<Score>
{
    /**
     * Enums to use for the different score types.
     */
    public static enum ScoreType
    {

        ONE(),
        TWO(),
        THREE(),
        FOUR(),
        FIVE(),
        SIX(),
        BONUS(),
        PAIR(),
        TWO_PAIR(),
        THREE_OF_A_KIND(),
        FOUR_OF_A_KIND(),
        SMALL_STRAIGHT(),
        LARGE_STRAIGHT(),
        HOUSE(),
        CHANSE(),
        YAHTZEE();
    }

    private String name;
    private ScoreType type;
    private int value;

    /**
     * Creates a new score with the entered type and name.
     * Defaault value sets to 0
     *
     * @param type the ScoreType enum to represent the type.
     * @param name The name of the new score.
     */
    public Score(ScoreType type, String name)
    {
        this.type = type;
        this.name = name;
        this.value = 0;
    }

    /**
     * Get the name of the score.
     *
     * @return the name of the score.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Get the type of the score.
     *
     * @return the type of the score.
     */
    public ScoreType getType()
    {
        return type;
    }

    /**
     * Set the value of the score.
     *
     * @param value the new value.
     */
    protected void setValue(int value)
    {
        this.value = value;
    }

    /**
     * Get the value of the score.
     *
     * @return the value of the score.
     */
    public int getValue()
    {
        return value;
    }

    /**
     * The setValue method is uniqe for every score.
     *
     * @param dice the Die[] array with the current dices.
     */
    public abstract void setValue(Die[] dice);

    /**
     * Compares if this Score is equal to another score by comparing the 
     * ScoreTypes, there may only be one instance of any givven ScoreType in
     * the players Score board.
     *
     * @param obj the other object to be compared
     * @return true if they were of the same type. or false if they wern't or if
     * the other object was not a Score.
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Score)
        {
            Score that = (Score) obj;
            return this.getType() == that.getType();
        }

        return false;
    }

    /**
     * Compares that score with this one by subtracting the other scores value
     * with this scores value. If that Score has a greater value, a
     * positive is returned, a negative number if this was greater
     * and zero if they are equal.
     *
     * @param that The Score to compare with
     * @return A negative number if the current score is greater, zero if
     * they are egual and a positive number if that score is greater.
     */
    public int compareTo(Score that)
    {
        return that.getValue() - this.getValue();
    }

    /**
     * Gets the value of the Score as a String.
     *
     * @return the value of the Score as "(X)" where X is the Scores value.
     */
    @Override
    public String toString()
    {
        return name + " (" + getValue() + ")";
    }
}
