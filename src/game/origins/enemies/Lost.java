package game.origins.enemies;

public class Lost implements EnemyBehavior{

    //Lost data members
    int level, defenseStat, attackStat, speedStat, healthStat;
    boolean shiny;
    private final int BASE_DEFENSE = 3;
    private final int BASE_ATTACK = 5;
    private final int BASE_SPEED = 4;
    private final double BASE_EVASION = .04;


    @Override
    public void enemyAttack() {

    }

    @Override
    public void enemySkill() {

    }

    @Override
    public void uniqueEnemyPassive() {

    }

    @Override
    public int damageTaken(int userAttack) {
        return 0;
    }
}
