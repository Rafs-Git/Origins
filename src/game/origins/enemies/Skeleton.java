package game.origins.enemies;

import java.util.Random;

/**
 * <p>
 *     Creates an ominous and tall Skeleton class enemy. With strong attack, weak defense, average speed, and a strong offensive skill, you must be ready to take some damage.
 * </p>
 */
public class Skeleton extends EnemyParentClass {

    /**
     * Creates a Skeleton enemy based on its level
     * @param level
     */
    public Skeleton(int level) {
        this.level = level;
        defenseStat = level * BASE_DEFENSE;
        attackStat = level * BASE_ATTACK;
        speedStat = level * BASE_SPEED;
        healthStat = level * BASE_HP;
        shiny = shinyStatus();
    }

    //Skeleton data members
    private int level, defenseStat, attackStat, speedStat, healthStat;
    private boolean shiny;
    private final int BASE_DEFENSE = 2;
    private final int BASE_ATTACK = 6;
    private final int BASE_SPEED = 4;
    private final int BASE_HP = 25;
    private final double BASE_EVASION = .05;

    /**
     * Determines whether the monster evaded damage before it calls super class method
     * @param userAttack amount of damage the user inflicted to monster
     */
    @Override
    public void damageTaken(int userAttack) {
        int rand = new Random().nextInt(100);

        if (rand <= (BASE_EVASION * 100)) {
            //"ATTACK HAS BEEN EVADED"
        }
        else {
            super.damageTaken(userAttack);
        }
    }

    /**
     * Fetches the evasion rate of monster
     * @return Base monster evasion
     */
    public double getBASE_EVASION() {
        return BASE_EVASION;
    }

    @Override
    public boolean isShiny() {
        return super.isShiny();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public int getHealthStat() {
        return super.getHealthStat();
    }
}
