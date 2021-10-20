package game.origins.GUI;

import javax.swing.*;

public class User {

    private double level;
    private double defenseStat;
    private double attackStat;
    private double speedStat;
    private double healthStat;
    private final String name = "User";
    private final int BASE_DEFENSE = 3;
    private final int BASE_ATTACK = 10;
    private final int BASE_SPEED = 4;
    private final int BASE_HP = 20;
    private final double BASE_EVASION = .04;
    private double fullHP;

    User(int level) {
        setLevel(level);
    }

    public String getName() {
        return name;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
        setAttackStat();
        setDefenseStat();
        setHealthStat();
        setSpeedStat();
    }

    public double getDefenseStat() {
        return defenseStat;
    }

    public void setDefenseStat() {
        if (level == 1) {
            this.defenseStat = BASE_DEFENSE;
        }
        else {
            this.defenseStat = this.defenseStat * this.getLevel();
        }
    }

    public double getAttackStat() {
        return attackStat;
    }

    public void setAttackStat() {
        if (level == 1) {
            this.attackStat = BASE_ATTACK;
        }
        else {
            this.attackStat = this.attackStat * this.getLevel();
        }
    }

    public double getSpeedStat() {
        return speedStat;
    }

    public void setSpeedStat() {
        if (level == 1) {
            this.speedStat = BASE_SPEED;
        }
        else {
            this.speedStat = this.speedStat * this.getLevel();
        }
    }

    public double getHealthStat() {
        return healthStat;
    }

    public void setHealthStat() {
        if (level == 1) {
            this.healthStat = BASE_HP;
        }
        else {
            this.healthStat = this.healthStat * this.getLevel();
        }
        this.fullHP = this.healthStat;
    }

    public void defendAction(JTextArea currentEvent) {
        this.defenseStat = this.defenseStat * 2;
        currentEvent.setText("You raise your shield and grit your teeth, preparing to defend from a heavy hit");
    }

    public void healAction(JTextArea currentEvent) {
        if (this.healthStat < this.fullHP) {
            this.healthStat += (this.attackStat * 3);
            currentEvent.setText("You have healed your hp for " + (this.attackStat * 3) + " much points! You now currently have "
                    + this.healthStat + " much HP!");
        }
        currentEvent.setText("ALAS, the stress of the battle got into your head and it seems you attempted to heal yourself at full HP");
    }
}

