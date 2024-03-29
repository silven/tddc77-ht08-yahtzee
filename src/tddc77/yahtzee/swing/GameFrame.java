package tddc77.yahtzee.swing;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import tddc77.yahtzee.Die;
import tddc77.yahtzee.Game;
import tddc77.yahtzee.HighScoreFactory;
import tddc77.yahtzee.Player;
import tddc77.yahtzee.Score;

/**
 *
 * @author John Törnblom (johto012), Mikael Silvén (miksi016)
 */
public class GameFrame extends javax.swing.JFrame implements
        PropertyChangeListener
{
    //Dirty hack for enableing the AISimulator

    private boolean isComputer;
    private Game game;

    /** Creates new form GameFrame */
    public GameFrame()
    {
        initComponents();
        isComputer = false;
        setLocationRelativeTo(null); //center
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playersTabbedPane = new javax.swing.JTabbedPane();
        dicePanel = new javax.swing.JPanel();
        playerPanel = new javax.swing.JPanel();
        possibleScoreLabel = new javax.swing.JLabel();
        possibleScoreComboBox = new javax.swing.JComboBox();
        saveScoreButton = new javax.swing.JButton();
        currentPlayerTitleLabel = new javax.swing.JLabel();
        currentPlayerLabel = new javax.swing.JLabel();
        rollsLeftTitleLabel = new javax.swing.JLabel();
        rollsLeftLabel = new javax.swing.JLabel();
        rollButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newGameMenuItem = new javax.swing.JMenuItem();
        startGameMenuItem = new javax.swing.JMenuItem();
        highScoreMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        quitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yahtzee");
        setResizable(false);

        dicePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        playerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        possibleScoreLabel.setText("Scores:");

        possibleScoreComboBox.setEnabled(false);

        saveScoreButton.setText("Save");
        saveScoreButton.setEnabled(false);
        saveScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveScoreButtonActionPerformed(evt);
            }
        });

        currentPlayerTitleLabel.setText("Player:");

        currentPlayerLabel.setText(" ");

        rollsLeftTitleLabel.setText("Rolls left:");

        rollsLeftLabel.setText(" ");

        javax.swing.GroupLayout playerPanelLayout = new javax.swing.GroupLayout(playerPanel);
        playerPanel.setLayout(playerPanelLayout);
        playerPanelLayout.setHorizontalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerPanelLayout.createSequentialGroup()
                        .addComponent(possibleScoreLabel)
                        .addGap(6, 6, 6)
                        .addComponent(possibleScoreComboBox, 0, 146, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveScoreButton))
                    .addGroup(playerPanelLayout.createSequentialGroup()
                        .addComponent(rollsLeftTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rollsLeftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                    .addGroup(playerPanelLayout.createSequentialGroup()
                        .addComponent(currentPlayerTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentPlayerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {currentPlayerTitleLabel, possibleScoreLabel, rollsLeftTitleLabel});

        playerPanelLayout.setVerticalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(possibleScoreLabel)
                    .addComponent(possibleScoreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveScoreButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPlayerTitleLabel)
                    .addComponent(currentPlayerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollsLeftTitleLabel)
                    .addComponent(rollsLeftLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rollButton.setText("Roll");
        rollButton.setEnabled(false);
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        newGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newGameMenuItem.setText("New game");
        newGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newGameMenuItem);

        startGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        startGameMenuItem.setText("Start game");
        startGameMenuItem.setEnabled(false);
        startGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(startGameMenuItem);

        highScoreMenuItem.setText("High score");
        highScoreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoreMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(highScoreMenuItem);
        fileMenu.add(jSeparator1);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playersTabbedPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rollButton, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(dicePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playersTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rollButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        playersTabbedPane.getAccessibleContext().setAccessibleName("defaultTab");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void saveScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveScoreButtonActionPerformed
    Score s = (Score) possibleScoreComboBox.getSelectedItem();
    if (s != null)
    {
        game.chooseScoreType(s.getType());
        saveScoreButton.setEnabled(false);
        possibleScoreComboBox.setEnabled(false);
    }
}//GEN-LAST:event_saveScoreButtonActionPerformed

private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
    System.exit(0);
}//GEN-LAST:event_quitMenuItemActionPerformed

private void startGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameMenuItemActionPerformed
    if (game == null)
    {
        return;
    }
    game.start();
}//GEN-LAST:event_startGameMenuItemActionPerformed

private void newGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameMenuItemActionPerformed
    //Remove old playerPanels
    for (Object obj : playersTabbedPane.getComponents())
    {
        if (obj instanceof PlayerPanel)
        {
            playersTabbedPane.remove((PlayerPanel) obj);
        }
    }

    //remove old dice
    for (Object obj : dicePanel.getComponents())
    {
        if (obj instanceof DiePanel)
        {
            dicePanel.remove((DiePanel) obj);
        }
    }
    game = new Game();
    game.addPropertyChangeListener(this);

    NewGameDialog dialog = new NewGameDialog(this, true, game);
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
    saveScoreButton.setEnabled(false);
    possibleScoreComboBox.setEnabled(false);
    rollButton.setEnabled(false);
    startGameMenuItem.setEnabled(true);
}//GEN-LAST:event_newGameMenuItemActionPerformed

private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed
    game.nextRound();
}//GEN-LAST:event_rollButtonActionPerformed

private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aboutMenuItemActionPerformed
{//GEN-HEADEREND:event_aboutMenuItemActionPerformed
    AboutDialog dialog = new AboutDialog(this, true);
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}//GEN-LAST:event_aboutMenuItemActionPerformed

private void highScoreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoreMenuItemActionPerformed
    HighScoreDialog dialog = new HighScoreDialog(this, true);
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}//GEN-LAST:event_highScoreMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Throwable t)
        {
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new GameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel currentPlayerLabel;
    private javax.swing.JLabel currentPlayerTitleLabel;
    private javax.swing.JPanel dicePanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem highScoreMenuItem;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newGameMenuItem;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JTabbedPane playersTabbedPane;
    private javax.swing.JComboBox possibleScoreComboBox;
    private javax.swing.JLabel possibleScoreLabel;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JButton rollButton;
    private javax.swing.JLabel rollsLeftLabel;
    private javax.swing.JLabel rollsLeftTitleLabel;
    private javax.swing.JButton saveScoreButton;
    private javax.swing.JMenuItem startGameMenuItem;
    // End of variables declaration//GEN-END:variables

    private void showPlayerPanel(Player p)
    {
        //Find the panel
        for (Object obj : playersTabbedPane.getComponents())
        {
            if (obj instanceof PlayerPanel)
            {
                PlayerPanel pPanel = (PlayerPanel) obj;
                //and set it selected
                if (pPanel.getPlayer().equals(p))
                {
                    playersTabbedPane.setSelectedComponent(pPanel);
                }
            }
        }
    }

    public void propertyChange(PropertyChangeEvent evt)
    {
        String property = evt.getPropertyName();
        Object obj = evt.getNewValue();

        //Current player changed, update the View
        if (property.equals(Game.CURRENT_PLAYER_PROPERTY))
        {
            if (obj instanceof Player)
            {
                Player p = (Player) obj;
                showPlayerPanel(p);
                currentPlayerLabel.setText(p.getName());
                isComputer = p.isComputer();

                //Dirty hack to auto roll the first time
                if (isComputer)
                {
                    rollButtonActionPerformed(null);
                }
            }
        }
        //New dice arrived, add them to dicePanel
        else if (property.equals(Game.DICE_PROPERTY))
        {
            if (obj instanceof Die[])
            {
                for (Die die : (Die[]) obj)
                {
                    dicePanel.add(new DiePanel(die));
                }
            }
        }
        //New player added, adding new playerPanel to the tabbedPane
        else if (property.equals(Game.PLAYER_PROPERTY))
        {
            if (obj instanceof Player)
            {
                Player p = (Player) obj;
                playersTabbedPane.add(new PlayerPanel(p));
                pack();
            }
        }
        //The list of possible scores was updated, refresh the combobox
        else if (property.equals(Game.POSSIBLE_SCORES_PROPERTY))
        {
            possibleScoreComboBox.removeAllItems();
            if (obj instanceof Score[])
            {
                for (Score s : (Score[]) obj)
                {
                    possibleScoreComboBox.addItem(s);
                }
                saveScoreButton.setEnabled(true);
                possibleScoreComboBox.setEnabled(true);
            }
        }
        //The game has ended, disable some buttons, bring up the game result
        //dialog and update the highscore
        else if (property.equals(Game.RUNNING_PROPERTY))
        {
            if (obj instanceof Boolean)
            {
                Boolean running = (Boolean) obj;
                rollButton.setEnabled(running);
                startGameMenuItem.setEnabled(!running);

                if (!running)
                {
                    saveScoreButton.setEnabled(false);
                    possibleScoreComboBox.setEnabled(false);

                    //add to high score
                    boolean doSave = true;
                    for (Player p : game.getPlayers())
                    {
                        try
                        {
                            HighScoreFactory.addToHighScore(p);
                        }
                        catch (IOException ex)
                        {
                            doSave = false;
                            JOptionPane.showMessageDialog(this,
                                    ex.getMessage(),
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                    try
                    {
                        //Don't try to save if there was an error when adding
                        //scores
                        if (doSave)
                        {
                            HighScoreFactory.save();
                        }
                    }
                    catch (IOException ex)
                    {
                        JOptionPane.showMessageDialog(this,
                                ex.getMessage(),
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    GameResultDialog dialog = new GameResultDialog(this, true,
                            game);
                    dialog.setLocationRelativeTo(this);
                    dialog.setVisible(true);
                }
            }
        }
        //Rolls left changed, update the view
        else if (property.equals(Game.ROLLS_LEFT_PROPERTY))
        {
            if (obj instanceof Integer)
            {
                Integer rollsLeft = (Integer) obj;
                rollsLeftLabel.setText(rollsLeft.toString());
                rollButton.setEnabled(rollsLeft > 0);
            }
        }
        //Dirty hack to enable a AISimulator. It will allways pick (and save)
        //the score with the highest score
        else if (property.equals(Game.WAITING_FOR_ACTION_EVENT))
        {
            if (obj.equals(Game.EVENT_CHOOSE_SCORE) && isComputer)
            {
                game.chooseScoreType(game.getPossileScores()[0].getType());
            }
        }

    }
}
