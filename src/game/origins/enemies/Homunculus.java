package game.origins.enemies;

public class Homunculus implements EnemyBehavior{

    //Homunculus data members
    int level, defenseStat, attackStat, speedStat;
    boolean shiny;
    private final int BASE_DEFENSE = 7;
    private final int BASE_ATTACK = 2;
    private final int BASE_SPEED = 4;
    private final double BASE_EVASION = .1;

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
