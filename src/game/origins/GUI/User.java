package game.origins.GUI;

import javax.swing.*;
import java.util.Random;

public class User {

    private int level;
    private int defenseStat;
    private int attackStat;
    private int speedStat;
    private int healthStat;
    private final String name = "User";
    private final int BASE_DEFENSE = 3;
    private final int BASE_ATTACK = 10;
    private final int BASE_SPEED = 4;
    private final int BASE_HP = 20;
    private final double BASE_EVASION = .04;
    private int fullHP;

    public User(int level) {
        setLevel(level);
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int levelIncoming) {
        level = levelIncoming;
        setAttackStat();
        setDefenseStat();
        setHealthStat();
        setSpeedStat();
    }

    public int getDefenseStat() {
        return defenseStat;
    }

    public void setDefenseStat() {
        if (level == 1) {
            defenseStat = BASE_DEFENSE;
        }
        else {
            defenseStat = defenseStat * getLevel();
        }
    }

    public int getAttackStat() {
        return attackStat;
    }

    public void setAttackStat() {
        if (level == 1) {
            attackStat = BASE_ATTACK;
        }
        else {
            attackStat = attackStat * getLevel();
        }
    }

    public int getSpeedStat() {
        return speedStat;
    }

    public void setSpeedStat() {
        if (level == 1) {
            speedStat = BASE_SPEED;
        }
        else {
            speedStat = speedStat * getLevel();
        }
    }

    public int getHealthStat() {
        return healthStat;
    }

    public void setHealthStat() {
        if (level == 1) {
            healthStat = BASE_HP;
        }
        else {
            healthStat = healthStat * getLevel();
        }
        fullHP = healthStat;
    }

    public void defendAction(JTextArea currentEvent) {
        defenseStat = defenseStat * 2;
        currentEvent.setText("You raise your shield and grit your teeth, preparing to defend from a heavy hit");
    }

    public void healAction(JTextArea currentEvent) {
        if (healthStat < fullHP) {
            healthStat += (attackStat * 3);
            currentEvent.setText("You have healed your hp for " + (attackStat * 3) + " points! You now currently have "
                    + healthStat + " much HP!");
        }
        else currentEvent.setText("ALAS, the stress of the battle got into your head and it seems you attempted to heal yourself at full HP");
    }

    public void userEvade(int damage) {
        int rand = new Random().nextInt(100);

        if (rand <= (BASE_EVASION * 100)) {
            OriginsGUI.textEditor("Nice! You dodged the enemy's attack.");
        }
        else {
            userDamageTaken(damage);
        }
    }

    public void userDamageTaken(int damage) {
        healthStat -= damage;
        OriginsGUI.textEditor("Unfortunately, you have taken " + damage + " damage and have a remaining " + healthStat + " hp!");
    }

}

