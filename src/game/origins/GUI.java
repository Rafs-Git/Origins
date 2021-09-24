package game.origins;

import javax.swing.*;
import java.awt.*;

/**
 * <p>
 * Creates a GUI for the actual game!
 * </p>
 */
public class GUI {


    //data members
    private final JFrame frame;
    private final JPanel panel;

    /**
     * Constructor that creates the framework of the actual game
     */
    public GUI() {

        frame = new JFrame();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Origins");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
