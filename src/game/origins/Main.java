package game.origins;

import game.origins.GUI.OriginsGUI;
import game.origins.enemies.*;

import java.util.Random;


/**
 * @author Rafeedmefood
 * <p>
 * This code will run my original game: Origins!
 */
public class Main {

    public static void main(String[] Args) {

        int lostNum = 0;
        int homunculusNum = 0;
        int abominationNum = 0;
        int jinnNum = 0;
        int skeletonNum = 0;

        Abomination [] abominations = new Abomination[10];
        Homunculus [] homunculi = new Homunculus[10];
        Jinn [] jinns = new Jinn[10];
        Lost[] lost = new Lost[10];
        Skeleton [] skeletons = new Skeleton[10];

        new OriginsGUI();




    }

    public static int enemyType(int lostNum, int homunculusNum, int abominationNum, int jinnNum, int skeletonNum) {

        int number = new Random().nextInt(5) + 1;
        if (number == 1) {

        } else if (number == 2) {

        } else if (number == 3) {

        } else if (number == 4) {

        } else if (number == 5) {

        }
    }
}
