package tddc77.yahtzee;

import java.util.ArrayList;
import java.util.List;
import tddc77.yahtzee.Score.ScoreType;

/**
 *
 * @author John Törnblom (johto012), Mikael Silvén (miksi016)
 */
public class ScoreFactory
{

    public static final int SCORE_BONUS_LIMIT = 63;
    public static final ScoreType[] bonus = new ScoreType[]
    {
        ScoreType.ONE,
        ScoreType.TWO,
        ScoreType.THREE,
        ScoreType.FOUR,
        ScoreType.FIVE,
        ScoreType.SIX
    };

    /**
     * Finds and returns a wanted score (going by ScoreType) in a givven list.
     * If the wanted score was not found, null is returned.
     *
     * @param type the ScoreType you seek.
     * @param scores the list of Scores in which to search.
     * @return the wanted score if it was found, null if it was not.
     */
    public static Score findScore(Score.ScoreType type, List<Score> scores)
    {
        for (Score s : scores)
        {
            if (s.getType().equals(type))
            {
                return s;
            }
        }
        return null;
    }

    /**
     * Sums up the scores from 1 to 6 (or those who are specified in the bonus
     * array) and determines how much is missing to acheive the bonus.
     *
     * @param scores the list of Scores in which to look and search
     * @return the number of points missing to acheive bonus. If the bonus is
     * acheived, 0 is returned.
     */
    public static int getLeftForBonus(List<Score> scores)
    {
        int sum = 0;

        for (ScoreType t : bonus)
        {
            Score s = ScoreFactory.findScore(t, scores);
            if (s == null)
            {
                continue;
            }
            sum += s.getValue();
        }

        if (sum >= SCORE_BONUS_LIMIT)
        {
            return 0;
        }

        return SCORE_BONUS_LIMIT - sum;
    }

    /**
     * Creates a list with all possible scores except the bonus one.
     * This makes instances of the abstract Scores and sets a uniqe
     * setValues() method depending on the ScoreType.
     *
     * @return A list with the scores that's been created.
     */
    public static List<Score> createAllScores()
    {
        ArrayList<Score> scores = new ArrayList<Score>();

        // 1 point per 1
        scores.add(new Score(Score.ScoreType.ONE, "Ones")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (d.getNumber() == 1)
                    {
                        value += d.getNumber();
                    }
                }
                setValue(value);
            }
        });
        // 2 points per 2
        scores.add(new Score(Score.ScoreType.TWO, "Twos")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (d.getNumber() == 2)
                    {
                        value += d.getNumber();
                    }
                }
                setValue(value);
            }
        });
        // 3 points per 3
        scores.add(new Score(Score.ScoreType.THREE, "Threes")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (d.getNumber() == 3)
                    {
                        value += d.getNumber();
                    }
                }
                setValue(value);
            }
        });
        // 4 points per 4
        scores.add(new Score(Score.ScoreType.FOUR, "Fours")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (d.getNumber() == 4)
                    {
                        value += d.getNumber();
                    }
                }
                setValue(value);
            }
        });
        // 5 points per 5
        scores.add(new Score(Score.ScoreType.FIVE, "Fives")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (d.getNumber() == 5)
                    {
                        value += d.getNumber();
                    }
                }
                setValue(value);
            }
        });
        // 6 points per 6, suprised?
        scores.add(new Score(Score.ScoreType.SIX, "Sixes")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (d.getNumber() == 6)
                    {
                        value += d.getNumber();
                    }
                }
                setValue(value);
            }
        });
        // Bonus scores are not created here.
        // Pair, if you have more than 1 of any givven number on any givven die
        // you've got a pair. A pair in ones gives 2 points.
        scores.add(new Score(Score.ScoreType.PAIR, "Pair")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (Die.count(dice, d) > 1)
                    {
                        int newValue = d.getNumber() * 2;
                        value = newValue > value ? newValue : value;
                    }
                }
                setValue(value);
            }
        });
        // Two pairs, if you have more than 3 of any givven number on any given
        // die, you must have 2 pairs of that number.
        // Else we check if you have more than one number (a pair) and then
        // if you have more than 1 of any other number (another pair), if
        // you do not have 2 pairs, the score is set to 0.
        scores.add(new Score(Score.ScoreType.TWO_PAIR, "Two pairs")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int p1 = 0;
                int value = 0;

                for (Die d : dice)
                {
                    if (Die.count(dice, d) > 3)
                    {
                        value = d.getNumber()*4;
                        break;
                    }
                    else if (Die.count(dice, d) > 1)
                    {
                        if (p1 == 0)
                        {
                            p1 = d.getNumber();
                        }
                        else if (p1 != d.getNumber())
                        {
                            value = 2*p1 + 2*d.getNumber();
                            break;
                        }
                    }
                }
                setValue(value);
            }
        });
        // Do you have more than 2 of any givven number on any givven die,
        // you've got 3 of a kind. 3 times the value of the die is rewarded.
        scores.add(new Score(Score.ScoreType.THREE_OF_A_KIND, "Three of a kind")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (Die.count(dice, d) > 2)
                    {
                        value = d.getNumber() * 3;
                        break;
                    }
                }
                setValue(value);
            }
        });

        // Do you have more than 3 of any givven number on any givven die
        // you've got four of a kind. 4 * the die value is set if this is true.
        scores.add(new Score(Score.ScoreType.FOUR_OF_A_KIND, "Four of a kind")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    if (Die.count(dice, d) > 3)
                    {
                        value = d.getNumber() * 4;
                        break;
                    }
                }
                setValue(value);
            }
        });
        // If you do NOT have any pairs, and you do NOT have any SIXES, you must
        // have a small straight.
        scores.add(new Score(Score.ScoreType.SMALL_STRAIGHT, "Small straight")
        {

            @Override
            public void setValue(Die[] dice)
            {
                boolean hasPair = false;
                boolean hasSix = false;

                for (Die d : dice)
                {
                    if (Die.count(dice, d) > 1)
                    {
                        hasPair = true;
                        break;
                    }
                    if (d.getNumber() == 6)
                    {
                        hasSix = true;
                        break;
                    }
                }
                if (hasPair || hasSix)
                {
                    setValue(0);
                }
                else
                {
                    setValue(15);
                }
            }
        });

        // If you do NOT have any pairs, and you do NOT have any ONES, you must
        // have a large straight.
        scores.add(new Score(Score.ScoreType.LARGE_STRAIGHT, "Large straigt")
        {

            @Override
            public void setValue(Die[] dice)
            {
                boolean hasPair = false;
                boolean hasOne = false;

                for (Die d : dice)
                {
                    if (Die.count(dice, d) > 1)
                    {
                        hasPair = true;
                        break;
                    }
                    if (d.getNumber() == 1)
                    {
                        hasOne = true;
                        break;
                    }
                }
                if (hasPair || hasOne)
                {
                    setValue(0);
                }
                else
                {
                    setValue(20);
                }
            }
        });
        // If you do have three of a kind, and a pair that does not enter into
        // the three earlier cards, you have a house!
        scores.add(new Score(Score.ScoreType.HOUSE, "House")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int tripps = 0;
                int pair = 0;
                int value = 0;

                for (Die d : dice)
                {
                    if (Die.count(dice, d) == 3)
                    {
                        tripps = d.getNumber() * 3;
                    }
                    else if (Die.count(dice, d) == 2)
                    {
                        pair = d.getNumber() * 2;
                    }

                }
                if (tripps != 0 && pair != 0)
                {
                    value = tripps + pair;
                }
                setValue(value);
            }
        });

        // Chanse is the sum of the numbers on the dices.
        scores.add(new Score(Score.ScoreType.CHANSE, "Chanse")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                for (Die d : dice)
                {
                    value += d.getNumber();
                }
                setValue(value);
            }
        });
        // If you have 5 of the same number, you have a YAHTZEE!
        // Congratulations!
        scores.add(new Score(Score.ScoreType.YAHTZEE, "Yahtzee")
        {

            @Override
            public void setValue(Die[] dice)
            {
                int value = 0;

                if (Die.count(dice, dice[0]) > 4)
                {
                    value = 50;
                }
                setValue(value);
            }
        });

        return scores;
    }

    /**
     * Creates the bonus Score with a setvalue method that always sets 50.
     * The score is created by the game when it decides if a player has acheived
     * the bonus
     *
     * @return Score the newly created bonus score
     */
    public static Score createBonusScore()
    {
        return new Score(Score.ScoreType.BONUS, "Bonus")
        {

            @Override
            public void setValue(Die[] dice)
            {
                setValue(50);
            }
        };
    }
}