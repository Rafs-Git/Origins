package game.origins.GUI;


import game.origins.enemies.*;

import javax.swing.*;
import java.awt.*;

/**
 * <p>
 * Creates a GUI for the actual game!
 * </p>
 */
public class OriginsGUI{

    //data members
    private final Abomination[] abominationObjects;
    private final Homunculus[] homunculusObjects;
    private final Jinn[] jinnObjects;
    private final Lost[] lostObjects;
    private final Skeleton[] skeletonObjects;
    private JPanel mainButtonPanel;
    private JButton attack, defend, heal;
    private JTextArea currentEvent;
    private final ImageIcon ORIGINS_ICON_IMAGE = new ImageIcon("src/game/origins/images/OriginsIcon.png"); //Image of Origins icon
    public static JFrame mainFrame;
    public static JPanel mainImagePanel;
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

        User playerOne = new User(1);

        abominationObjects = new Abomination[10];
        homunculusObjects = new Homunculus[10];
        jinnObjects = new Jinn[10];
        lostObjects = new Lost[10];
        skeletonObjects = new Skeleton[10];

        mainFrame = new JFrame();
        mainFrame.setTitle("Origins");
        mainFrame.setSize(1220,700);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainImagePanel = new JPanel();
        mainImagePanel.setBounds(0, 0, 1200, 400);
        mainButtonPanel = new JPanel();
        mainButtonPanel.setLayout(null);
        mainButtonPanel.setBounds(0,400,600,300);

        currentEvent = new JTextArea();
        currentEvent.setBounds(600, 400, 600, 300);
        currentEvent.setLineWrap(true);
        currentEvent.setWrapStyleWord(true);
        currentEvent.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
        currentEvent.setEditable(false);

        attack = new JButton();
        attack.setBounds(75, 50, 100, 150);
        attack.setText("ATTACK");
        attack.setFocusable(false);
        attack.addActionListener(e -> userAttacks(playerOne, EnemyAction.getCurrentEnemy(), currentEvent));
        defend = new JButton();
        defend.setBounds(225, 50, 100, 150);
        defend.setText("DEFEND");
        defend.setFocusable(false);
        defend.addActionListener(e -> userDefends(playerOne));
        heal = new JButton();
        heal.setBounds(375, 50, 100, 150);
        heal.setText("HEAL");
        heal.setFocusable(false);
        heal.addActionListener(e -> userHeals(playerOne));

        mainButtonPanel.add(heal);
        mainButtonPanel.add(attack);
        mainButtonPanel.add(defend);

        heal.setVisible(true);
        attack.setVisible(true);
        defend.setVisible(true);
        currentEvent.setVisible(true);

        mainFrame.add(mainImagePanel);
        mainFrame.add(mainButtonPanel);
        mainFrame.add(currentEvent);
        mainFrame.setIconImage(ORIGINS_ICON_IMAGE.getImage());
        mainFrame.setVisible(true);


    }


    private void userAttacks(User player, int monsterType, JTextArea currentEvent) {
        if (monsterType == 1) {
            double damage = player.getAttackStat() - abominationObjects[EnemyAction.getAbominationNum()].getDefenseStat();
            boolean successfulHit = abominationObjects[EnemyAction.getAbominationNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                currentEvent.setText("You attacked the abomination with " + damage + " much damage! The abomination has " +
                        abominationObjects[EnemyAction.getAbominationNum()].getHealthStat() + " hp left.");
            }
        }

        else if (monsterType == 2) {
            double damage = player.getAttackStat() - homunculusObjects[EnemyAction.getHomunculusNum()].getDefenseStat();
            boolean successfulHit = homunculusObjects[EnemyAction.getHomunculusNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                currentEvent.setText("You attacked the homunculus with " + damage + " much damage! The homunculus has " +
                        homunculusObjects[EnemyAction.getHomunculusNum()].getHealthStat() + " hp left.");
            }
        }

        else if (monsterType == 3) {
            double damage = player.getAttackStat() - jinnObjects[EnemyAction.getJinnNum()].getDefenseStat();
            boolean successfulHit = jinnObjects[EnemyAction.getJinnNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                currentEvent.setText("You attacked the jinn with " + damage + " much damage! The jinn has " +
                        jinnObjects[EnemyAction.getJinnNum()].getHealthStat() + " hp left.");
            }
        }

        else if (monsterType == 4) {
            double damage = player.getAttackStat() - lostObjects[EnemyAction.getLostNum()].getDefenseStat();
            boolean successfulHit = lostObjects[EnemyAction.getLostNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                currentEvent.setText("You attacked the lost with " + damage + " much damage! The lost has " +
                        lostObjects[EnemyAction.getLostNum()].getHealthStat() + " hp left.");
            }
        }

        else {
            double damage = player.getAttackStat() - skeletonObjects[EnemyAction.getSkeletonNum()].getDefenseStat();
            boolean successfulHit = skeletonObjects[EnemyAction.getSkeletonNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                currentEvent.setText("You attacked the skeleton with " + damage + " much damage! The skeleton has " +
                        skeletonObjects[EnemyAction.getSkeletonNum()].getHealthStat() + " hp left.");
            }
        }
    }


    private void userDefends(User player) {

        player.defendAction();

    }
    private void userHeals(User player) {

        player.healAction();

    }


    public static void showEnemy(int monsterNum, JPanel mainImagePanel) {
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
