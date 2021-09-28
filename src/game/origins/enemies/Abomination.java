package game.origins.enemies;

public class Abomination implements EnemyBehavior{

    //Abomination data members
    int level, defenseStat, attackStat, speedStat;
    boolean shiny;
    private final int BASE_DEFENSE = 4;
    private final int BASE_ATTACK = 8;
    private final int BASE_SPEED = 2;
    private final double BASE_EVASION = 0;

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
