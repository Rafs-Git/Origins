package game.origins.enemies;

public class Skeleton implements EnemyBehavior{

    //Skeleton data members
    int level, defenseStat, attackStat, speedStat;
    boolean shiny;
    private final int BASE_DEFENSE = 2;
    private final int BASE_ATTACK = 6;
    private final int BASE_SPEED = 4;
    private final double BASE_EVASION = .05;

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
