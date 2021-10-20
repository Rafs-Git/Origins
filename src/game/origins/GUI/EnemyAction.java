package game.origins.GUI;

import game.origins.enemies.*;

import javax.swing.*;

/**
 * <p>
 * Summons the enemies to the JFrame
 * </p>
 */
public class EnemyAction {

    private static int lostNum = 0;
    private static int homunculusNum = 0;
    private static int abominationNum = 0;
    private static int jinnNum = 0;
    private static int skeletonNum = 0;
    private static int currentEnemyType;

    public static void enemyType(Abomination[] abominations, Homunculus[] homunculi, Jinn[] jinns, Lost[] lost, Skeleton[] skeletons, int level, int number) {

        if (number == 1) {
            abominationNum++;
            abominations[abominationNum] = new Abomination(level);
            currentEnemyType = number;
        }

        else if (number == 2) {
            homunculusNum++;
            homunculi[homunculusNum] = new Homunculus(level);
            currentEnemyType = number;
        }

        else if (number == 3) {
            jinnNum++;
            jinns[jinnNum] = new Jinn(level);
            currentEnemyType = number;
        }

        else if (number == 4) {
            lostNum++;
            lost[lostNum] = new Lost(level);
            currentEnemyType = number;
        }

        else {
            skeletonNum++;
            skeletons[skeletonNum] = new Skeleton(level);
            currentEnemyType = number;
        }
    }

    /**
     * Summons the specified enemy and adds it to the JFrame
     *
     * @param enemyIndex Specified enemy index
     */
    public static void summonEnemy(int enemyIndex, JTextArea currentEvent) {
        OriginsGUI.showEnemy(enemyIndex, OriginsGUI.getMainImagePanel(), currentEvent);
    }

    /**
     * Used to clear out the enemy after it's defeat
     */
    public static void removeEnemy(int enemyIndex, JTextArea currentEvent) {
        OriginsGUI.removeEnemy(enemyIndex, OriginsGUI.getMainImagePanel(), currentEvent);
    }

    public static int getLostNum() {
        return lostNum;
    }

    public static int getHomunculusNum() {
        return homunculusNum;
    }

    public static int getAbominationNum() {
        return abominationNum;
    }

    public static int getJinnNum() {
        return jinnNum;
    }

    public static int getSkeletonNum() {
        return skeletonNum;
    }

    public static int getCurrentEnemyType() {
        return currentEnemyType;
    }


}
