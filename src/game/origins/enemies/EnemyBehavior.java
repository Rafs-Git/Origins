package game.origins.enemies;

import javax.swing.*;

/**
 * Interface that which contains all universal actions of monsters in Origins.
 */
public interface EnemyBehavior {

    /**
     * Monster attacks
     */
    void enemyAttack();

    /**
     * Monster activates its skill
     */
    void enemySkill();

    /**
     * Monster's unique skill
     */
    void uniqueEnemyPassive();

    /**
     * Monster receives an attack
     * @param userAttack amount of damage the user inflicts
     */
    void damageTaken(double userAttack);


    /**
     * Determines whether this instance of monster is a shiny
     * @return boolean value of shiny status
     */
    default boolean shinyStatus() {
        double shinyChance = Math.random();
        boolean isShiny;
        if (shinyChance <= .05) {
            isShiny = true;
        }
        else isShiny = false;
        return isShiny;
    }


}
