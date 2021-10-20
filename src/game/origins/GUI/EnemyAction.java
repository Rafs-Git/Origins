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

    public static void enemyAttacks(Abomination[] abominations, Homunculus[] homunculi, Jinn[] jinns, Lost[] lost, Skeleton[] skeletons,User user) {
        int damage;
        if (currentEnemyType == 1) {
            damage = abominations[abominationNum].getAttackStat() - user.getDefenseStat();
            user.userEvade(damage);
        }

        else if (currentEnemyType == 2) {
            damage = homunculi[homunculusNum].getAttackStat() - user.getDefenseStat();
            user.userEvade(damage);
        }

        else if (currentEnemyType == 3) {
            damage = jinns[jinnNum].getAttackStat() - user.getDefenseStat();
            user.userEvade(damage);
        }

        else if (currentEnemyType == 4) {
            damage = lost[lostNum].getAttackStat() - user.getDefenseStat();
            user.userEvade(damage);
        }

        else {
            damage = skeletons[skeletonNum].getAttackStat() - user.getDefenseStat();
            user.userEvade(damage);
        }
    }

    public static boolean isEnemyAlive(Abomination[] abominations, Homunculus[] homunculi, Jinn[] jinns, Lost[] lost, Skeleton[] skeletons) {
        if (currentEnemyType == 1) {
            if (abominations[abominationNum].getHealthStat() <= 0) {
                return false;
            }
            else return true;
        }

        else if (currentEnemyType == 2) {
            if (homunculi[homunculusNum].getHealthStat() <= 0) {
                return false;
            }
            else return true;
        }

        else if (currentEnemyType == 3) {
            if (jinns[jinnNum].getHealthStat() <= 0) {
                return false;
            }
            else return true;
        }

        else if (currentEnemyType == 4) {
            if (lost[lostNum].getHealthStat() <= 0) {
                return false;
            }
            else return true;
        }

        else {
            if (skeletons[skeletonNum].getHealthStat() <= 0) {
                return false;
            }
            else return true;
        }
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
