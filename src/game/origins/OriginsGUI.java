package game.origins;


import javax.swing.*;
import java.awt.*;

/**
 * <p>
 * Creates a GUI for the actual game!
 * </p>
 */
public class OriginsGUI extends JFrame{


    //data members
    private JPanel mainImagePanel; //Displays picture of enemies
    private final ImageIcon originsWindowImage = new ImageIcon("src/game/origins/images/OriginsIcon.png"); //Image of Origins icon
    /**
     * Constructor that creates the framework of the actual game
     */
    public OriginsGUI() {

        this.setTitle("Origins");
        this.setSize(1200,800);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainImagePanel = new JPanel();
        mainImagePanel.setBounds(0, 0, 1200, 400);

        this.add(mainImagePanel);
        this.setIconImage(originsWindowImage.getImage());
        this.setVisible(true);

    }
}
