package game.origins.GUI;

public class User {

    private int level, defenseStat, attackStat, speedStat, healthStat;
    private final String name = "User";
    private final int BASE_DEFENSE = 3;
    private final int BASE_ATTACK = 3;
    private final int BASE_SPEED = 4;
    private final int BASE_HP = 20;
    private final double BASE_EVASION = .04;

    User(int level) {
        setLevel(level);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        setAttackStat();
        setDefenseStat();
        setHealthStat();
        setSpeedStat();
    }

    public int getDefenseStat() {
        return defenseStat;
    }

    public void setDefenseStat() {
        this.defenseStat = this.defenseStat * this.getLevel();
    }

    public int getAttackStat() {
        return attackStat;
    }

    public void setAttackStat() {
        this.attackStat = this.attackStat * this.getLevel();
    }

    public int getSpeedStat() {
        return speedStat;
    }

    public void setSpeedStat() {
        this.speedStat = this.speedStat * this.getLevel();
    }

    public int getHealthStat() {
        return healthStat;
    }

    public void setHealthStat() {
        this.healthStat = this.healthStat * this.getLevel();
    }
}

