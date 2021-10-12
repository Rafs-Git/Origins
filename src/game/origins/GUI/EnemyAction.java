package game.origins.GUI;

import game.origins.GUI.OriginsGUI;
import game.origins.enemies.EnemyParentClass;

import javax.swing.*;
import java.util.Random;

/**
 * <p>
 * Summons the enemies to the JFrame
 * </p>
 */
public class EnemyAction {

    /**
     * Summons the specified enemy and adds it to the JFrame
     *
     * @param enemyIndex Specified enemy index
     */
    public static void summonEnemy(int enemyIndex, int enemyLevel) {
        OriginsGUI.summonEnemy(enemyIndex, enemyLevel, OriginsGUI.getMainImagePanel());
    }

    /**
     * Used to clear out the enemy after it's defeat
     */
    public static void removeEnemy(int enemyIndex) {
        OriginsGUI.removeEnemy(enemyIndex, OriginsGUI.getMainImagePanel());
    }

    public static void enemyType() {

        int number = new Random().nextInt(5) + 1;
        if (number == 1) {

        } else if (number == 2) {

        } else if (number == 3) {

        } else if (number == 4) {

        } else if (number == 5) {

        }
    }

}
