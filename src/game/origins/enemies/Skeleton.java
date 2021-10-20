package game.origins.enemies;

import javax.swing.*;
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
    private final int BASE_DEFENSE = 2;
    private final int BASE_ATTACK = 6;
    private final int BASE_SPEED = 4;
    private final int BASE_HP = 25;
    private final double BASE_EVASION = .05;

    public boolean evasionChance(double userAttack, JTextArea currentEvent) {
        int rand = new Random().nextInt(100);

        if (rand <= (BASE_EVASION * 100)) {
            currentEvent.setText("ALAS THE MONSTER EVADED YOUR ATTACK!");
            return false;
        }
        else {
            super.damageTaken(userAttack);
            return true;
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
