package tddc77.yahtzee.swing;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import tddc77.yahtzee.Player;
import tddc77.yahtzee.Score;

/**
 *
 * @author John Törnblom (johto012), Mikael Silvén (miksi016)
 */
public class PlayerPanel extends javax.swing.JPanel implements
        PropertyChangeListener
{

    private Player player;

    public Player getPlayer()
    {
        return player;
    }

    public PlayerPanel()
    {
        this(new Player("", false));
    }

    /** Creates new form PlayerPanel */
    public PlayerPanel(Player p)
    {
        p.addPropertyChangeListener(this);
        setName(p.toString());
        player = p;
        initComponents();
    }

    /**
     * Updates the value of the TextField for the Score s with the value of the
     * score
     *
     * @param s The score to update
     */
    private void handleScore(Score s)
    {
        switch (s.getType())
        {
            case ONE:
                onesTextField.setText(Integer.toString(s.getValue()));
                break;
            case TWO:
                twosTextField.setText(Integer.toString(s.getValue()));
                break;
            case THREE:
                threesTextField.setText(Integer.toString(s.getValue()));
                break;
            case FOUR:
                foursTextField.setText(Integer.toString(s.getValue()));
                break;
            case FIVE:
                fivesTextField.setText(Integer.toString(s.getValue()));
                break;
            case SIX:
                sixesTextField.setText(Integer.toString(s.getValue()));
                break;
            case BONUS:
                bonusTextField.setText(Integer.toString(s.getValue()));
                break;
            case CHANSE:
                chanseTextField.setText(Integer.toString(s.getValue()));
                break;
            case PAIR:
                pairTextField.setText(Integer.toString(s.getValue()));
                break;
            case TWO_PAIR:
                twoPairsTextField.setText(Integer.toString(s.getValue()));
                break;
            case THREE_OF_A_KIND:
                threeOfAKindaTextField.setText(Integer.toString(s.getValue()));
                break;
            case FOUR_OF_A_KIND:
                fourOfAKindTextField.setText(Integer.toString(s.getValue()));
                break;
            case SMALL_STRAIGHT:
                smallStraightTextField.setText(Integer.toString(s.getValue()));
                break;
            case LARGE_STRAIGHT:
                largeStraightTextField.setText(Integer.toString(s.getValue()));
                break;
            case HOUSE:
                houseTextField.setText(Integer.toString(s.getValue()));
                break;
            case YAHTZEE:
                yatzeeTextField.setText(Integer.toString(s.getValue()));
                break;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        onesLabel = new javax.swing.JLabel();
        onesTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        twosTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        threesTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sixesTextField = new javax.swing.JTextField();
        fivesTextField = new javax.swing.JTextField();
        foursTextField = new javax.swing.JTextField();
        leftForBonusLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bonusTextField = new javax.swing.JTextField();
        chanseTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        yatzeeTextField = new javax.swing.JTextField();
        onesLabel1 = new javax.swing.JLabel();
        pairTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        twoPairsTextField = new javax.swing.JTextField();
        threeOfAKindaTextField = new javax.swing.JTextField();
        fourOfAKindTextField = new javax.swing.JTextField();
        smallStraightTextField = new javax.swing.JTextField();
        largeStraightTextField = new javax.swing.JTextField();
        houseTextField = new javax.swing.JTextField();
        totalScoreTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        onesLabel.setText("Ones:");

        onesTextField.setEditable(false);

        jLabel3.setText("Twos:");

        twosTextField.setEditable(false);

        jLabel4.setText("Threes:");

        threesTextField.setEditable(false);

        jLabel6.setText("Fives:");

        jLabel5.setText("Fours:");

        jLabel7.setText("Sixes:");

        sixesTextField.setEditable(false);

        fivesTextField.setEditable(false);

        foursTextField.setEditable(false);

        leftForBonusLabel.setText("Left untill bonus:");

        jLabel15.setText("Bonus:");

        bonusTextField.setEditable(false);

        chanseTextField.setEditable(false);

        jLabel17.setText("Chanse:");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftForBonusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(onesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sixesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fivesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bonusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chanseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        leftPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel15, jLabel17, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, onesLabel});

        leftPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bonusTextField, chanseTextField, fivesTextField, foursTextField, onesTextField, sixesTextField, threesTextField, twosTextField});

        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onesLabel)
                    .addComponent(onesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(threesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(foursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fivesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(sixesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(leftForBonusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bonusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chanseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        leftPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bonusTextField, chanseTextField, fivesTextField, foursTextField, jLabel15, jLabel17, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, leftForBonusLabel, onesLabel, onesTextField, sixesTextField, threesTextField, twosTextField});

        add(leftPanel);

        yatzeeTextField.setEditable(false);

        onesLabel1.setText("Pair:");

        pairTextField.setEditable(false);

        jLabel14.setText("House:");

        jLabel12.setText("Large straigt:");

        jLabel8.setText("Two pairs:");

        jLabel9.setText("Three of a kind:");

        jLabel11.setText("Four of a kind:");

        jLabel10.setText("Small straigth:");

        twoPairsTextField.setEditable(false);

        threeOfAKindaTextField.setEditable(false);

        fourOfAKindTextField.setEditable(false);

        smallStraightTextField.setEditable(false);

        largeStraightTextField.setEditable(false);

        houseTextField.setEditable(false);

        totalScoreTextField.setEditable(false);

        jLabel18.setFont(jLabel18.getFont().deriveFont(jLabel18.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel18.setText("Total score:");

        jLabel1.setText("Yahtzee:");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yatzeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rightPanelLayout.createSequentialGroup()
                            .addComponent(onesLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pairTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rightPanelLayout.createSequentialGroup()
                            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel12)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(twoPairsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(threeOfAKindaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fourOfAKindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(smallStraightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(largeStraightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(houseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel14, jLabel18, jLabel8, jLabel9, onesLabel1});

        rightPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fourOfAKindTextField, houseTextField, largeStraightTextField, pairTextField, smallStraightTextField, threeOfAKindaTextField, totalScoreTextField, twoPairsTextField, yatzeeTextField});

        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onesLabel1)
                    .addComponent(pairTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoPairsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(threeOfAKindaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourOfAKindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smallStraightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(largeStraightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yatzeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(totalScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fourOfAKindTextField, houseTextField, jLabel1, jLabel10, jLabel11, jLabel12, jLabel14, jLabel18, jLabel8, jLabel9, largeStraightTextField, onesLabel1, pairTextField, smallStraightTextField, threeOfAKindaTextField, totalScoreTextField, twoPairsTextField, yatzeeTextField});

        add(rightPanel);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bonusTextField;
    private javax.swing.JTextField chanseTextField;
    private javax.swing.JTextField fivesTextField;
    private javax.swing.JTextField fourOfAKindTextField;
    private javax.swing.JTextField foursTextField;
    private javax.swing.JTextField houseTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField largeStraightTextField;
    private javax.swing.JLabel leftForBonusLabel;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel onesLabel;
    private javax.swing.JLabel onesLabel1;
    private javax.swing.JTextField onesTextField;
    private javax.swing.JTextField pairTextField;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField sixesTextField;
    private javax.swing.JTextField smallStraightTextField;
    private javax.swing.JTextField threeOfAKindaTextField;
    private javax.swing.JTextField threesTextField;
    private javax.swing.JTextField totalScoreTextField;
    private javax.swing.JTextField twoPairsTextField;
    private javax.swing.JTextField twosTextField;
    private javax.swing.JTextField yatzeeTextField;
    // End of variables declaration//GEN-END:variables
    public void propertyChange(PropertyChangeEvent evt)
    {
        String property = evt.getPropertyName();
        Object obj = evt.getNewValue();

        if(property == null || obj == null)
        {
            return;
        }
        
        //A new score has been added, update the TextField for the new score
        if (property.equals(Player.SCORE_PROPERTY))
        {
            if (obj instanceof Score)
            {
                Score s = (Score) obj;
                handleScore(s);
            }
        }
        //The Loeft for bonus attribute changed, update the Label
        else if (property.equals(Player.LEFT_FOR_BONUS_PROPERTY))
        {
            if (obj instanceof Integer)
            {
                leftForBonusLabel.setText("Left untill bonus: " +
                        obj.toString());
            }
        }
        //Total score changed, update the textField
        else if (property.equals(Player.TOTAL_SCORE_PROPERTY))
        {
            if (obj instanceof Integer)
            {
                totalScoreTextField.setText(obj.toString());
            }
        }
    }
}
