package game.origins.enemies;

import javax.swing.*;
import java.util.Random;

/**
 * <p>
 *     Creates a Lost class enemy, which is a corrupt human who has lost his way. Frail base stats but has a devastatingly cunning skill.
 *     User shares similar base stats.
 * </p>
 */
public class Lost extends EnemyParentClass {

    /**
     * Creates a Lost enemy based on its level
     * @param level
     */
    public Lost(int level) {
        this.level = level;
        shiny = shinyStatus();
        if (shiny) {
            defenseStat = level * (BASE_DEFENSE + 3);
            attackStat = level * (BASE_ATTACK + 3);
            speedStat = level * (BASE_SPEED + 1);
            healthStat = level * (BASE_HP + 2);
        }
        else {
            defenseStat = level * BASE_DEFENSE;
            attackStat = level * BASE_ATTACK;
            speedStat = level * BASE_SPEED;
            healthStat = level * BASE_HP;
            shiny = shinyStatus();
        }
    }

    //Lost data members
    private final int BASE_DEFENSE = 4;
    private final int BASE_ATTACK = 4;
    private final int BASE_SPEED = 4;
    private final int BASE_HP = 20;
    private final double BASE_EVASION = .04;

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
