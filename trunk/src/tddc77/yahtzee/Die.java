package tddc77.yahtzee;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

/**
 * 
 * @author John Törnblom (johto012), Mikael Silvén (miksi016)
 */
public class Die implements Comparable
{

    public static final String NUMBER_PROPERTY = "Number";
    public static final String ON_HOLD_PROPERTY = "OnHold";
    private PropertyChangeSupport prop = new PropertyChangeSupport(this);
    private boolean onHold;
    private int number;
    private Random rand;

    public Die()
    {
        onHold = false;
        number = 0;
        rand = new Random();
    }

    //TODO: javadoc
    public void addPropertyChangeListener(PropertyChangeListener l)
    {
        prop.addPropertyChangeListener(l);
    }

    /**
     * Get the number of the die.
     *
     * @return the number of the die.
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * Set the number of the die.
     *
     * @param number new number of the die.
     */
    private void setNumber(int number)
    {
        int oldNumber = this.number;
        this.number = number;
        prop.firePropertyChange(NUMBER_PROPERTY, oldNumber, number);
    }

    /**
     * Set the die on hold. While the die is on hold, it cannot be rolled.
     * If the number of the die is lesser than 1, no action will be taken.
     *
     * @param onHold true/false.
     */
    public void setOnHold(boolean onHold)
    {
        if (number > 0)
        {
            boolean oldOnHold = this.onHold;
            this.onHold = onHold;
            prop.firePropertyChange(ON_HOLD_PROPERTY, oldOnHold, onHold);
        }
    }

    /**
     * Is the die on hold?
     *
     * @return true/false.
     */
    public boolean isOnHold()
    {
        return onHold;
    }

    /**
     * Resetting the die will set the number to zero and unhold it
     *
     */
    public void reset()
    {
        setOnHold(false);
        setNumber(0);
    }

    /**
     * Roll the die to generate a new random number between 1 and 6.
     * The seed used to generate the number is the current system time.
     * If the die is on hold, nothing will happend.
     *
     */
    public void roll()
    {
        if (!onHold)
        {
            setNumber(rand.nextInt(6) + 1);
        }
    }

    /**
     * Count the accurence of die in the array dice.
     *
     * @param dice the array to count from
     * @param die the die to count
     * @return Number of accurence of die in dice.
     */
    public static int count(Die[] dice, Die die)
    {
        int ret = 0;

        for (Die d : dice)
        {
            if (die.equals(d))
            {
                ret++;
            }
        }
        return ret;
    }

    /**
     * Compares the die to the specified object. if the object is an instane
     * of Die, the numbers will be compared, otherwhise the toString() values
     *
     * @param obj the object to copmpare against
     * @return a possitive integer if this is greater than obj,
     * a negative number if this is smaller than obj,
     * zero if they are equal.
     */
    public int compareTo(Object obj)
    {
        if (obj instanceof Die)
        {
            Die that = (Die) obj;
            return this.getNumber() - that.getNumber();
        }
        return this.toString().compareTo(obj.toString());
    }

    /**
     * Compares this die to the specified object. The result is true if and
     * only if the argument is not null and is a Die object that represents
     * the same number as this object.
     *
     * @param obj The object to compare this String against
     * @return true if the given object represents a Die equivalent to this
     * die, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Die)
        {
            Die that = (Die) obj;
            return this.getNumber() == that.getNumber();
        }
        return false;
    }

    /**
     * Returns the number on the die as a string.
     *
     * @return String the value as a String.
     */
    @Override
    public String toString()
    {
        return Integer.toString(number);
    }
}
