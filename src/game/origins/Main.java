package game.origins;

import game.origins.GUI.EnemyAction;
import game.origins.GUI.OriginsGUI;
import game.origins.GUI.User;
import game.origins.enemies.*;

import java.util.Random;


/**
 * @author Rafeedmefood
 * <p>
 * This code will run my original game: Origins!
 */
public class Main {

    public static void main(String[] Args) throws InterruptedException {

        User playerOne = new User(1);
        new OriginsGUI(playerOne);
        int num, level;
        boolean isActionDone = false;


        for (int i = 1; i < 1000; i++) {

            OriginsGUI.hideButtons();
            level = i;
            playerOne.setLevel(level);
            num = OriginsGUI.enemyInstance(level);
            Thread.sleep(8000);
            OriginsGUI.showButtons();
            do {

                OriginsGUI.textEditor("What is your next move? You currently have " + playerOne.getHealthStat() + " health, and a "+ playerOne.getFullHP() +
                        "HP cap to your Heal.");
                while (!isActionDone) {
                    Thread.sleep(1);
                    isActionDone = OriginsGUI.isActionDone();
                }
                OriginsGUI.hideButtons();
                Thread.sleep(3000);
                if (OriginsGUI.checkEnemyHealth()) {
                    OriginsGUI.enemyAttacker(playerOne);
                    playerOne.setDefenseStat();
                }
                Thread.sleep(3000);
                OriginsGUI.setActionDone(false);
                isActionDone = false;
                OriginsGUI.showButtons();

            } while (OriginsGUI.checkEnemyHealth());

            OriginsGUI.removeEnemyInstance(num);
        }
    }
}
