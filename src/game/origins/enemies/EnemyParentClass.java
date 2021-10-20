package game.origins.enemies;

import javax.swing.*;
import java.util.Random;

/**
 * <p>
 *     Main Enemy class which all enemies will inherit from, contains core methodologies and functions of enemies.
 * </p>
 */
public class EnemyParentClass implements EnemyBehavior {

    //Enemy Data Members
    int level, defenseStat, attackStat, speedStat, healthStat;
    boolean shiny;

    /**
     * Returns shiny status of monster
     * @return shiny status
     */
    public boolean isShiny() {
        return shiny;
    }

    /**
     * Fetches level value
     * @return level of monster
     */
    public int getLevel() {
        return level;
    }

    /**
     * Fetches health value
     * @return health of monster
     */
    public int getHealthStat() {
        return healthStat;
    }

    /**
     * Performs an attack
     */
    @Override
    public void enemyAttack() {

    }

    /**
     * Performs a skill
     */
    @Override
    public void enemySkill() {

    }

    /**
     * Performs the unique passive of monster
     */
    @Override
    public void uniqueEnemyPassive() {

    }

    /**
     * Removes health from the enemy
     * @param userAttack amount of damage the user inflicted to monster
     */
    public void damageTaken(double userAttack) {

        healthStat -= userAttack;

    }

    public int getDefenseStat() {
        return defenseStat;
    }
}
