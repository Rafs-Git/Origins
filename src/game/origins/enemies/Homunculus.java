package game.origins.enemies;

import javax.swing.*;
import java.util.Random;

/**
 * <p>
 *     Creates a Homunculus class enemy that is insanely tanky. Nimble with high health and defense, what he makes up in defense he lacks in offense.
 * </p>
 */
public class Homunculus extends EnemyParentClass {

    /**
     * Creates a Homunculus enemy based on its level
     * @param level
     */
    public Homunculus(int level) {
        this.level = level;
        shiny = shinyStatus();
        if (shiny) {
            defenseStat = level * (BASE_DEFENSE + 1);
            attackStat = level * (BASE_ATTACK + 2);
            speedStat = level * (BASE_SPEED + 1);
            healthStat = level * (BASE_HP + 3);
        }
        else {
            defenseStat = level * BASE_DEFENSE;
            attackStat = level * BASE_ATTACK;
            speedStat = level * BASE_SPEED;
            healthStat = level * BASE_HP;
            shiny = shinyStatus();
        }
    }

    //Homunculus data members
    private final int BASE_DEFENSE = 5;
    private final int BASE_ATTACK = 4;
    private final int BASE_SPEED = 4;
    private final int BASE_HP = 35;
    private final double BASE_EVASION = .1;

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
