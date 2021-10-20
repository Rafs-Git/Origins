package game.origins.GUI;


import game.origins.enemies.*;

import javax.swing.*;
import java.awt.*;
import java.sql.DataTruncation;
import java.util.Random;

/**
 * <p>
 * Creates a GUI for the actual game!
 * </p>
 */
public class OriginsGUI {

    //data members
    private static final Abomination[] abominationObjects = new Abomination[10];
    private static final Homunculus[] homunculusObjects = new Homunculus[10];
    private static final Jinn[] jinnObjects = new Jinn[10];
    private static final Lost[] lostObjects = new Lost[10];
    private static final Skeleton[] skeletonObjects = new Skeleton[10];
    private JPanel mainButtonPanel;
    private static JButton attack, defend, heal;
    private final ImageIcon ORIGINS_ICON_IMAGE = new ImageIcon("src/game/origins/images/OriginsIcon.png"); //Image of Origins icon
    private static JTextArea currentEvent;
    private static boolean actionDone = false;
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
    public OriginsGUI(User playerOne) {

        mainFrame = new JFrame();
        mainFrame.setTitle("Origins");
        mainFrame.setSize(1220, 700);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainImagePanel = new JPanel();
        mainImagePanel.setBounds(0, 0, 1200, 400);
        mainButtonPanel = new JPanel();
        mainButtonPanel.setLayout(null);
        mainButtonPanel.setBounds(0, 400, 600, 300);

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
        attack.addActionListener(e -> userAttacks(playerOne, EnemyAction.getCurrentEnemyType(), currentEvent));
        defend = new JButton();
        defend.setBounds(225, 50, 100, 150);
        defend.setText("DEFEND");
        defend.setFocusable(false);
        defend.addActionListener(e -> userDefends(playerOne, currentEvent));
        heal = new JButton();
        heal.setBounds(375, 50, 100, 150);
        heal.setText("HEAL");
        heal.setFocusable(false);
        heal.addActionListener(e -> userHeals(playerOne, currentEvent));

        mainButtonPanel.add(heal);
        mainButtonPanel.add(attack);
        mainButtonPanel.add(defend);

        heal.setVisible(true);
        attack.setVisible(true);
        defend.setVisible(true);
        currentEvent.setVisible(true);

        mainImagePanel.add(ABOMINATION);
        ABOMINATION.setVisible(false);
        mainImagePanel.add(SHINY_ABOMINATION);
        SHINY_ABOMINATION.setVisible(false);
        mainImagePanel.add(HOMUNCULUS);
        HOMUNCULUS.setVisible(false);
        mainImagePanel.add(SHINY_HOMUNCULUS);
        SHINY_HOMUNCULUS.setVisible(false);
        mainImagePanel.add(JINN);
        JINN.setVisible(false);
        mainImagePanel.add(SHINY_JINN);
        SHINY_JINN.setVisible(false);
        mainImagePanel.add(LOST);
        LOST.setVisible(false);
        mainImagePanel.add(SHINY_LOST);
        SHINY_LOST.setVisible(false);
        mainImagePanel.add(SKELETON);
        SKELETON.setVisible(false);
        mainImagePanel.add(SHINY_SKELETON);
        SHINY_SKELETON.setVisible(false);

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
                if (abominationObjects[EnemyAction.getAbominationNum()].getHealthStat() <= 0) {
                    currentEvent.setText("You attacked the abomination with " + damage + " damage! The abomination has 0 hp left.");
                } else {
                    currentEvent.setText("You attacked the abomination with " + damage + " damage! The abomination has " +
                            abominationObjects[EnemyAction.getAbominationNum()].getHealthStat() + " hp left.");
                }
            }
        } else if (monsterType == 2) {
            double damage = player.getAttackStat() - homunculusObjects[EnemyAction.getHomunculusNum()].getDefenseStat();
            boolean successfulHit = homunculusObjects[EnemyAction.getHomunculusNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                if (homunculusObjects[EnemyAction.getHomunculusNum()].getHealthStat() <= 0) {
                    currentEvent.setText("You attacked the homunculus with " + damage + " damage! The homunculus has 0 hp left.");
                } else {
                    currentEvent.setText("You attacked the homunculus with " + damage + " damage! The homunculus has " +
                            homunculusObjects[EnemyAction.getHomunculusNum()].getHealthStat() + " hp left.");
                }
            }
        } else if (monsterType == 3) {
            double damage = player.getAttackStat() - jinnObjects[EnemyAction.getJinnNum()].getDefenseStat();
            boolean successfulHit = jinnObjects[EnemyAction.getJinnNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                if (jinnObjects[EnemyAction.getJinnNum()].getHealthStat() <= 0) {
                    currentEvent.setText("You attacked the jinn with " + damage + " damage! The jinn has 0 hp left.");
                } else {
                    currentEvent.setText("You attacked the jinn with " + damage + " damage! The jinn has " +
                            jinnObjects[EnemyAction.getJinnNum()].getHealthStat() + " hp left.");
                }
            }
        } else if (monsterType == 4) {
            double damage = player.getAttackStat() - lostObjects[EnemyAction.getLostNum()].getDefenseStat();
            boolean successfulHit = lostObjects[EnemyAction.getLostNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                if (lostObjects[EnemyAction.getLostNum()].getHealthStat() <= 0) {
                    currentEvent.setText("You attacked the lost with " + damage + " damage! The lost has 0 hp left.");
                } else {
                    currentEvent.setText("You attacked the lost with " + damage + " damage! The lost has " +
                            lostObjects[EnemyAction.getLostNum()].getHealthStat() + " hp left.");
                }
            }
        } else {
            double damage = player.getAttackStat() - skeletonObjects[EnemyAction.getSkeletonNum()].getDefenseStat();
            boolean successfulHit = skeletonObjects[EnemyAction.getSkeletonNum()].evasionChance(damage, currentEvent);
            if (successfulHit) {
                if (skeletonObjects[EnemyAction.getSkeletonNum()].getHealthStat() <= 0) {
                    currentEvent.setText("You attacked the skeleton with " + damage + " damage! The skeleton has 0 hp left.");
                } else {
                    currentEvent.setText("You attacked the skeleton with " + damage + " damage! The skeleton has " +
                            skeletonObjects[EnemyAction.getSkeletonNum()].getHealthStat() + " hp left.");
                }
            }
        }

        OriginsGUI.setActionDone(true);
    }


    private void userDefends(User player, JTextArea currentEvent) {

        player.defendAction(currentEvent);
        OriginsGUI.setActionDone(true);

    }

    private void userHeals(User player, JTextArea currentEvent) {

        player.healAction(currentEvent);
        OriginsGUI.setActionDone(true);

    }

    public static void enemyAttacker(User playerOne) {
        EnemyAction.enemyAttacks(OriginsGUI.getAbominationObjects(), OriginsGUI.getHomunculusObjects(), OriginsGUI.getJinnObjects(),
                OriginsGUI.getLostObjects(), OriginsGUI.getSkeletonObjects(), playerOne);
    }

    public static boolean checkEnemyHealth() {
        return EnemyAction.isEnemyAlive(OriginsGUI.getAbominationObjects(), OriginsGUI.getHomunculusObjects(), OriginsGUI.getJinnObjects(),
                OriginsGUI.getLostObjects(), OriginsGUI.getSkeletonObjects());

    }


    public static int enemyInstance(int level) {

        int number = new Random().nextInt(5) + 1;
        EnemyAction.enemyType(OriginsGUI.getAbominationObjects(), OriginsGUI.getHomunculusObjects(), OriginsGUI.getJinnObjects(),
                OriginsGUI.getLostObjects(), OriginsGUI.getSkeletonObjects(), level, number);


        if (number == 1) {
            if (abominationObjects[EnemyAction.getAbominationNum()].isShiny()) {
                EnemyAction.summonEnemy(2, currentEvent);
                return 2;
            } else {
                EnemyAction.summonEnemy(1, currentEvent);
                return 1;
            }
        } else if (number == 2) {
            if (homunculusObjects[EnemyAction.getHomunculusNum()].isShiny()) {
                EnemyAction.summonEnemy(4, currentEvent);
                return 4;
            } else {
                EnemyAction.summonEnemy(3, currentEvent);
                return 3;
            }
        } else if (number == 3) {
            if (jinnObjects[EnemyAction.getJinnNum()].isShiny()) {
                EnemyAction.summonEnemy(6, currentEvent);
                return 6;
            } else {
                EnemyAction.summonEnemy(5, currentEvent);
                return 5;
            }
        } else if (number == 4) {
            if (lostObjects[EnemyAction.getLostNum()].isShiny()) {
                EnemyAction.summonEnemy(8, currentEvent);
                return 8;
            } else {
                EnemyAction.summonEnemy(7, currentEvent);
                return 7;
            }
        } else {
            if (skeletonObjects[EnemyAction.getSkeletonNum()].isShiny()) {
                EnemyAction.summonEnemy(10, currentEvent);
                return 10;
            } else {
                EnemyAction.summonEnemy(9, currentEvent);
                return 9;
            }
        }
    }

    public static void removeEnemyInstance(int monsterIndex) {
        EnemyAction.removeEnemy(monsterIndex, currentEvent);
    }

    public static void showEnemy(int monsterNum, JPanel mainImagePanel, JTextArea currentEvent) {
        if (monsterNum == 1) {
            ABOMINATION.setVisible(true);
            currentEvent.setText("You hear a painful moan from behind you. With a chill down your spine, you realize an ABOMINATION has found you!");
        } else if (monsterNum == 2) {
            SHINY_ABOMINATION.setVisible(true);
            currentEvent.setText("You hear a familiar moan from behind you, however it could be mistaken with a laugh. With a chill down your spine, you realize an SHINY ABOMINATION has found you!");
        } else if (monsterNum == 3) {
            HOMUNCULUS.setVisible(true);
            currentEvent.setText("As you traverse the land, a weird rustling is heard. You recognize it immediately. A HOMUNCULUS jumps into view as you ready your sword.");
        } else if (monsterNum == 4) {
            SHINY_HOMUNCULUS.setVisible(true);
            currentEvent.setText("As you traverse the land, your start profusely breaking into a sweat. It is too late you realize, as the SHINY HOMUNCULUS comes into view");
        } else if (monsterNum == 5) {
            JINN.setVisible(true);
        } else if (monsterNum == 6) {
            SHINY_JINN.setVisible(true);
        } else if (monsterNum == 7) {
            LOST.setVisible(true);
        } else if (monsterNum == 8) {
            SHINY_LOST.setVisible(true);
        } else if (monsterNum == 9) {
            SKELETON.setVisible(true);
        } else if (monsterNum == 10) {
            SHINY_SKELETON.setVisible(true);
        }
    }

    public static void removeEnemy(int monsterNum, JPanel mainImagePanel, JTextArea currentEvent) {
        if (monsterNum == 1) {
            ABOMINATION.setVisible(false);
        } else if (monsterNum == 2) {
            SHINY_ABOMINATION.setVisible(false);
        } else if (monsterNum == 3) {
            HOMUNCULUS.setVisible(false);
        } else if (monsterNum == 4) {
            SHINY_HOMUNCULUS.setVisible(false);
        } else if (monsterNum == 5) {
            JINN.setVisible(false);
        } else if (monsterNum == 6) {
            SHINY_JINN.setVisible(false);
        } else if (monsterNum == 7) {
            LOST.setVisible(false);
        } else if (monsterNum == 8) {
            SHINY_LOST.setVisible(false);
        } else if (monsterNum == 9) {
            SKELETON.setVisible(false);
        } else {
            SHINY_SKELETON.setVisible(false);
        }
    }

    public static JPanel getMainImagePanel() {
        return mainImagePanel;
    }

    public static Abomination[] getAbominationObjects() {
        return abominationObjects;
    }

    public static Homunculus[] getHomunculusObjects() {
        return homunculusObjects;
    }

    public static Jinn[] getJinnObjects() {
        return jinnObjects;
    }

    public static Lost[] getLostObjects() {
        return lostObjects;
    }

    public static Skeleton[] getSkeletonObjects() {
        return skeletonObjects;
    }

    public static boolean isActionDone() {
        return actionDone;
    }

    public static void setActionDone(boolean actionDone) {
        OriginsGUI.actionDone = actionDone;
    }

    public static void showButtons() {
        attack.setVisible(true);
        defend.setVisible(true);
        heal.setVisible(true);
    }

    public static void hideButtons() {
        attack.setVisible(false);
        defend.setVisible(false);
        heal.setVisible(false);
    }

    public static void textEditor(String message) {
        currentEvent.setText(message);
    }

    public static void death() {
        mainFrame.setVisible(false);
        mainFrame.dispose();
        System.exit(0);
    }


}
