package game.origins.GUI;


import javax.swing.*;
import java.util.PropertyResourceBundle;

/**
 * <p>
 * Creates a GUI for the actual game!
 * </p>
 */
public class OriginsGUI{

    //data members
    public static JFrame mainFrame;
    public static JPanel mainImagePanel;
    private JPanel mainButtonPanel, mainTextPanel;
    private JButton attack, defend, heal;
    private final ImageIcon ORIGINS_ICON_IMAGE = new ImageIcon("src/game/origins/images/OriginsIcon.png"); //Image of Origins icon
    private JLabel skeleton, lost, jinn, homunculus, abomination;
    private static final ImageIcon NORMAL_SKELETON_IMAGE = new ImageIcon("src/game/origins/images/Skeleton.png");
    private static final ImageIcon SHINY_SKELETON_IMAGE = new ImageIcon("src/game/origins/images/ShinySkeletonOrigins.png");
    private static final ImageIcon NORMAL_JINN_IMAGE = new ImageIcon("src/game/origins/images/JinnOrigins.png");
    private static final ImageIcon SHINY_JINN_IMAGE = new ImageIcon("src/game/origins/images/ShinyJinnOrigins.png");
    private static final ImageIcon NORMAL_LOST_IMAGE = new ImageIcon("src/game/origins/images/LostOrigins.png");
    private static final ImageIcon SHINY_LOST_IMAGE = new ImageIcon("src/game/origins/images/LostShinyOrigins.png");
    private static final ImageIcon NORMAL_ABOMINATION_IMAGE = new ImageIcon("src/game/origins/images/AbominationOrigins.png");
    private static final ImageIcon SHINY_ABOMINATION_IMAGE = new ImageIcon("src/game/origins/images/ShinyAbominationOrigins.png");
    private static final ImageIcon NORMAL_HOMUNCULUS_IMAGE = new ImageIcon("src/game/origins/images/HomunculusOrigins.png");
    private static final ImageIcon SHINY_HOMUNCULUS_IMAGE = new ImageIcon("src/game/origins/images/ShinyHomunculusOrigins.png");
    private static final JLabel SKELETON = new JLabel(NORMAL_SKELETON_IMAGE);
    private static final JLabel SHINY_SKELETON = new JLabel(SHINY_SKELETON_IMAGE);
    private static final JLabel JINN = new JLabel(NORMAL_JINN_IMAGE);
    private static final JLabel SHINY_JINN = new JLabel(SHINY_JINN_IMAGE);
    private static final JLabel LOST = new JLabel(NORMAL_LOST_IMAGE);
    private static final JLabel SHINY_LOST = new JLabel(SHINY_LOST_IMAGE);
    private static final JLabel ABOMINATION = new JLabel(NORMAL_ABOMINATION_IMAGE);
    private static final JLabel SHINY_ABOMINATION = new JLabel(SHINY_ABOMINATION_IMAGE);
    private static final JLabel HOMUNCULUS = new JLabel(NORMAL_HOMUNCULUS_IMAGE);
    private static final JLabel SHINY_HOMUNCULUS = new JLabel(SHINY_HOMUNCULUS_IMAGE);


    /**
     * Constructor that creates the framework of the actual game
     */
    public OriginsGUI() {

        mainFrame = new JFrame();
        mainFrame.setTitle("Origins");
        mainFrame.setSize(1200,700);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainImagePanel = new JPanel();
        mainImagePanel.setBounds(0, 0, 1200, 400);
        mainButtonPanel = new JPanel();
        mainButtonPanel.setLayout(null);
        mainButtonPanel.setBounds(0,400,600,300);
        mainTextPanel = new JPanel();
        mainTextPanel.setLayout(null);
        mainTextPanel.setBounds(600,400,600,300);

        attack = new JButton();
        attack.setBounds(75, 50, 100, 150);
        defend = new JButton();
        defend.setBounds(225, 50, 100, 150);
        heal = new JButton();
        heal.setBounds(375, 50, 100, 150);

        mainButtonPanel.add(heal);
        mainButtonPanel.add(attack);
        mainButtonPanel.add(defend);

        heal.setVisible(true);
        attack.setVisible(true);
        defend.setVisible(true);

        mainFrame.add(mainImagePanel);
        mainFrame.add(mainButtonPanel);
        mainFrame.setIconImage(ORIGINS_ICON_IMAGE.getImage());
        mainFrame.setVisible(true);

    }

    //private double attack() {

    //}
    //private double heal() {

   // }
   // private double defend() {

   // }

    public static void summonEnemy(int monsterNum, JPanel mainImagePanel) {
        if (monsterNum == 1) {
            mainImagePanel.add(ABOMINATION);
        }
        else if (monsterNum == 2) {
            mainImagePanel.add(SHINY_ABOMINATION);
        }
        else if (monsterNum == 3) {
            mainImagePanel.add(HOMUNCULUS);
        }
        else if (monsterNum == 4) {
            mainImagePanel.add(SHINY_HOMUNCULUS);
        }
        else if (monsterNum == 5) {
            mainImagePanel.add(JINN);
        }
        else if (monsterNum == 6) {
            mainImagePanel.add(SHINY_JINN);
        }
        else if (monsterNum == 7) {
            mainImagePanel.add(LOST);
        }
        else if (monsterNum == 8) {
            mainImagePanel.add(SHINY_LOST);
        }
        else if (monsterNum == 9) {
            mainImagePanel.add(SKELETON);
        }
        else if (monsterNum == 10) {
            mainImagePanel.add(SHINY_SKELETON);
        }
        mainFrame.add(mainImagePanel);
        mainFrame.setVisible(true);
    }

    public static void removeEnemy(int monsterNum, JPanel mainImagePanel) {
        if (monsterNum == 1) {
            mainImagePanel.remove(ABOMINATION);
        }
        else if (monsterNum == 2) {
            mainImagePanel.remove(SHINY_ABOMINATION);
        }
        else if (monsterNum == 3) {
            mainImagePanel.remove(HOMUNCULUS);
        }
        else if (monsterNum == 4) {
            mainImagePanel.remove(SHINY_HOMUNCULUS);
        }
        else if (monsterNum == 5) {
            mainImagePanel.remove(JINN);
        }
        else if (monsterNum == 6) {
            mainImagePanel.remove(SHINY_JINN);
        }
        else if (monsterNum == 7) {
            mainImagePanel.remove(LOST);
        }
        else if (monsterNum == 8) {
            mainImagePanel.remove(SHINY_LOST);
        }
        else if (monsterNum == 9) {
            mainImagePanel.remove(SKELETON);
        }
        else if (monsterNum == 10) {
            mainImagePanel.remove(SHINY_SKELETON);
        }
        mainFrame.add(mainImagePanel);
        mainFrame.setVisible(true);
    }

    public static JPanel getMainImagePanel() {
        return mainImagePanel;
    }
}
