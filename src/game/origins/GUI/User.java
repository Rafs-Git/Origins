package game.origins.GUI;

public class User {

    private double level;
    private double defenseStat;
    private double attackStat;
    private double speedStat;
    private double healthStat;
    private final String name = "User";
    private final int BASE_DEFENSE = 3;
    private final int BASE_ATTACK = 3;
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
        this.defenseStat = this.defenseStat * this.getLevel();
    }

    public double getAttackStat() {
        return attackStat;
    }

    public void setAttackStat() {
        this.attackStat = this.attackStat * this.getLevel();
    }

    public double getSpeedStat() {
        return speedStat;
    }

    public void setSpeedStat() {
        this.speedStat = this.speedStat * this.getLevel();
    }

    public double getHealthStat() {
        return healthStat;
    }

    public void setHealthStat() {
        this.healthStat = this.healthStat * this.getLevel();
        this.fullHP = this.healthStat;
    }

    public void defendAction() {
        this.defenseStat = this.defenseStat * 2;
    }

    public void healAction() {
        if (this.healthStat < this.fullHP) {
            this.healthStat += (this.attackStat);
        }
    }
}

