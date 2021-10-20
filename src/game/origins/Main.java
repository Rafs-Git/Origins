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
        int num;
        int level = 1;
        boolean isActionDone = false;


        num = OriginsGUI.enemyInstance(level);

        do {

            while (!isActionDone) {
                Thread.sleep(1);
                isActionDone = OriginsGUI.isActionDone();
            }
            OriginsGUI.hideButtons();
            Thread.sleep(3000);
            if (OriginsGUI.checkEnemyHealth()) {
                OriginsGUI.enemyAttacker(playerOne);
            }
            Thread.sleep(1500);
            OriginsGUI.setActionDone(false);
            isActionDone = false;
            OriginsGUI.showButtons();

        } while (OriginsGUI.checkEnemyHealth());
    }
}
