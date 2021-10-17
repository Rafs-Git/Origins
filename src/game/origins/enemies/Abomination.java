package game.origins.enemies;

import java.util.Random;

/**
 * <p>
 *     Creates an Abomination class enemy that is insanely powerful. Slow but with a devastating attack and average defense,
 *     use his lack of health to your advantage.
 * </p>
 */
public class Abomination extends EnemyParentClass {

    /**
     * Creates an Abomination enemy based on its level
     * @param level
     */
    public Abomination(int level) {
        this.level = level;
        defenseStat = level * BASE_DEFENSE;
        attackStat = level * BASE_ATTACK;
        speedStat = level * BASE_SPEED;
        healthStat = level * BASE_HP;
        shiny = shinyStatus();
    }

    //Abomination data members
    private int level, defenseStat, attackStat, speedStat, healthStat;
    private boolean shiny;
    private final int BASE_DEFENSE = 4;
    private final int BASE_ATTACK = 8;
    private final int BASE_SPEED = 2;
    private final int BASE_HP = 21;
    private final double BASE_EVASION = 0;

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
