package game.origins.enemies;

import javax.swing.*;

/**
 * <p>
 *     Summons the enemies to the JFrame
 * </p>
 */
public class EnemyAction {


    //data members
    private JPanel enemyPanel; //Displays picture of enemies
    private final ImageIcon SKELETON_ICON = new ImageIcon("src/game/origins/images/Skeleton.png"); //Image of Origins icon
    private final String[] ENEMY_LIST = {"Skeleton", "Abomination", "Homunculus" , "Lost", "Jinn"};

    /**
     * Summons the specified enemy and adds it to the JFrame
     * @param enemyIndex Specified enemy index
     */
    public static void summonEnemy(int enemyIndex) {
    }

    /**
     * Used to clear out the enemy after it's defeat
     */
    public static void removeEnemy() {

    }

}
