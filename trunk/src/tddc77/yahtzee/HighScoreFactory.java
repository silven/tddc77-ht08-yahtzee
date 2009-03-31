package tddc77.yahtzee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author John Törnblom (johto012), Mikael Silvén (miksi016)
 */
public class HighScoreFactory
{

    private static String pathName = System.getProperty("user.home") +
            File.separator +
            ".yahtzee";
    private static String fileName = "highscore.properties";
    private static String fullPath = pathName +
            File.separator +
            fileName;
    private static Properties prop = null;
    private static List<HighScore> highScoreList = new ArrayList<HighScore>();

    /**
     * loads the properties file into the game.
     * if the file does not exists it creates one and sets the default values.
     *
     * @throws java.io.IOException should the file not be written/read proper.
     */
    public static void load() throws IOException
    {
        prop = new Properties();

        File dir = new File(pathName);
        if (!dir.exists())
        {
            dir.mkdir();
        }

        File file = new File(fullPath);
        if (!file.exists())
        {
            file.createNewFile();
        }

        prop.load(new FileInputStream(file));

        for (Integer i = 1; i <= 10; i++)
        {
            if (prop.getProperty(i.toString() + ".name") == null)
            {
                prop.setProperty(i.toString() + ".name", "No name");
            }
            if (prop.getProperty(i.toString() + ".score") == null)
            {
                prop.setProperty(i.toString() + ".score", "0");
            }
        }

        highScoreList.clear();
        for (Integer i = 1; i <= 10; i++)
        {
            HighScore highScore = new HighScore();
            highScore.setName(prop.getProperty(i.toString() + ".name"));
            highScore.setScore(Integer.parseInt(prop.getProperty(i.toString() +
                    ".score")));
            highScoreList.add(highScore);
        }
    }

    /**
     * Static method to save the properties file and writes the values needed,
     * if the file has not been loaded, it calls on load().
     *
     * @throws java.io.IOException if the file was not written properly
     * @see #load() 
     */
    public static void save() throws IOException
    {
        if (prop == null)
        {
            load();
        }

        File file = new File(fullPath);

        for (Integer i = 1; i <= 10; i++)
        {
            HighScore highScore = highScoreList.get(i - 1);
            prop.setProperty(i.toString() + ".name", highScore.getName());
            prop.setProperty(i.toString() + ".score", Integer.toString(
                    highScore.getScore()));
        }

        prop.store(new FileOutputStream(file), new Date().toString());
    }

    /**
     * Static method to get a list with all the high scores.
     * If the list has not been loaded yet, it calls on load()
     *
     * @return the highscore list
     * @throws java.io.IOException if the file couldn't be properly loaded.
     */
    public static List<HighScore> getHighScores() throws IOException
    {
        if (prop == null)
        {
            load();
        }
        return highScoreList;
    }

    /**
     * Adds a player to the highscore list.
     * If the player was not eligable, he is instantly removed.
     *
     * @param p the player to be checked and added.
     * @return true/false if the player was added or not.
     * @throws java.io.IOException if the file couldn't be properly loaded.
     */
    public static boolean addToHighScore(Player p) throws IOException
    {
        if (prop == null)
        {
            load();
        }

        List<HighScore> highScores = getHighScores();

        HighScore highScore = new HighScore();
        highScore.setName(p.getName());
        highScore.setScore(p.getTotalScore());

        if (highScore.getScore() <= highScores.get(
                highScoreList.size() - 1).getScore())
        {
            return false;
        }

        highScores.add(highScore);

        Collections.sort(highScores);

        highScoreList.remove(highScoreList.size() - 1);

        return true;
    }
}
