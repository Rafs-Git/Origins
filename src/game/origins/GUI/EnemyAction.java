package game.origins.GUI;

import game.origins.enemies.*;

import java.util.Random;

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
    private static int currentEnemy;

    public static Object enemyType(Abomination[] abominations, Homunculus[] homunculi, Jinn[] jinns, Lost[] lost, Skeleton[] skeletons, int level) {

        int number = new Random().nextInt(5) + 1;

        if (number == 1) {
            abominationNum++;
            abominations[abominationNum] = new Abomination(level);
            currentEnemy = number;
            return abominations[(abominationNum)];
        }

        else if (number == 2) {
            homunculusNum++;
            homunculi[homunculusNum] = new Homunculus(level);
            currentEnemy = number;
            return homunculi[(homunculusNum)];
        }

        else if (number == 3) {
            jinnNum++;
            jinns[jinnNum] = new Jinn(level);
            currentEnemy = number;
            return jinns[(jinnNum)];
        }

        else if (number == 4) {
            lostNum++;
            lost[lostNum] = new Lost(level);
            currentEnemy = number;
            return lost[(lostNum)];
        }

        else {
            skeletonNum++;
            skeletons[skeletonNum] = new Skeleton(level);
            currentEnemy = number;
            return skeletons[(skeletonNum)];
        }
    }

    /**
     * Summons the specified enemy and adds it to the JFrame
     *
     * @param enemyIndex Specified enemy index
     */
    public static void summonEnemy(int enemyIndex, int enemyLevel) {
        OriginsGUI.showEnemy(enemyIndex, OriginsGUI.getMainImagePanel());
    }

    /**
     * Used to clear out the enemy after it's defeat
     */
    public static void removeEnemy(int enemyIndex) {
        OriginsGUI.removeEnemy(enemyIndex, OriginsGUI.getMainImagePanel());
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

    public static int getCurrentEnemy() {
        return currentEnemy;
    }
}
