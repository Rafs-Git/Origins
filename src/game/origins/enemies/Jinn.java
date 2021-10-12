package game.origins.enemies;

import java.util.Random;

/**
 * <p>
 *     Creates a Jinn class enemy that is very evasive and elusive. With a skill that allows it
 *     to increase his evasion, make sure you kill it quick before its too late.
 * </p>
 */
public class Jinn extends EnemyParentClass {

    /**
     * Creates a Jinn enemy based on its level
     * @param level
     */
    Jinn(int level) {
        this.level = level;
        defenseStat = level * BASE_DEFENSE;
        attackStat = level * BASE_ATTACK;
        speedStat = level * BASE_SPEED;
        healthStat = level * BASE_HP;
        shiny = shinyStatus();
    }

    //Jinn data members
    private int level, defenseStat, attackStat, speedStat, healthStat;
    private boolean shiny;
    private final int BASE_DEFENSE = 4;
    private final int BASE_ATTACK = 4;
    private final int BASE_SPEED = 4;
    private final int BASE_HP = 30;
    private final double BASE_EVASION = .15;

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
