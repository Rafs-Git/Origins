package game.origins.enemies;

public interface EnemyBehavior {

    void enemyAttack();
    void enemySkill();
    void uniqueEnemyPassive();
    int damageTaken(int userAttack);


    default boolean shinyCounter() {
        double shinyChance = Math.random();
        boolean isShiny;
        if (shinyChance <= .05) {
            isShiny = true;
        }
        else isShiny = false;
        return isShiny;
    }


}
