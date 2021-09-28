package game.origins.enemies;

public class Jinn implements EnemyBehavior{

    //Jinn data members
    int level, defenseStat, attackStat, speedStat;
    boolean shiny;
    private final int BASE_DEFENSE = 4;
    private final int BASE_ATTACK = 4;
    private final int BASE_SPEED = 4;
    private final double BASE_EVASION = .15;

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
