package game.origins.GUI;


import javax.swing.*;
import java.util.PropertyResourceBundle;

/**
 * <p>
 * Creates a GUI for the actual game!
 * </p>
 */
public class OriginsGUI extends JFrame{


    //data members
    private JPanel mainImagePanel, mainButtonPanel, mainTextPanel;
    private JButton attack, defend, heal;
    private final ImageIcon ORIGINS_ICON_IMAGE = new ImageIcon("src/game/origins/images/OriginsIcon.png"); //Image of Origins icon
    private JLabel skeleton, lost, jinn, homunculus, abomination;
    private final ImageIcon NORMAL_SKELETON_IMAGE = new ImageIcon("src/game/origins/images/Skeleton.png");
    private final ImageIcon SHINY_SKELETON_IMAGE = new ImageIcon("src/game/origins/images/ShinySkeletonOrigins.png");
    private final ImageIcon NORMAL_JINN_IMAGE = new ImageIcon("src/game/origins/images/JinnOrigins.png");
    private final ImageIcon SHINY_JINN_IMAGE = new ImageIcon("src/game/origins/images/ShinyJinnOrigins.png");
    private final ImageIcon NORMAL_LOST_IMAGE = new ImageIcon("src/game/origins/images/LostOrigins.png");
    private final ImageIcon SHINY_LOST_IMAGE = new ImageIcon("src/game/origins/images/LostShinyOrigins.png");
    private final ImageIcon NORMAL_ABOMINATION_IMAGE = new ImageIcon("src/game/origins/images/AbominationOrigins.png");
    private final ImageIcon SHINY_ABOMINATION_IMAGE = new ImageIcon("src/game/origins/images/ShinyAbominationOrigins.png");
    private final ImageIcon NORMAL_HOMUNCULUS_IMAGE = new ImageIcon("src/game/origins/images/HomunculusOrigins.png");
    private final ImageIcon SHINY_HOMUNCULUS_IMAGE = new ImageIcon("src/game/origins/images/ShinyHomunculusOrigins.png");
    private final JLabel SKELETON = new JLabel(NORMAL_SKELETON_IMAGE);
    private final JLabel SHINY_SKELETON = new JLabel(SHINY_SKELETON_IMAGE);
    private final JLabel JINN = new JLabel(NORMAL_JINN_IMAGE);
    private final JLabel SHINY_JINN = new JLabel(SHINY_JINN_IMAGE);
    private final JLabel LOST = new JLabel(NORMAL_LOST_IMAGE);
    private final JLabel SHINY_LOST = new JLabel(SHINY_LOST_IMAGE);
    private final JLabel ABOMINATION = new JLabel(NORMAL_ABOMINATION_IMAGE);
    private final JLabel SHINY_ABOMINATION = new JLabel(SHINY_ABOMINATION_IMAGE);
    private final JLabel HOMUNCULUS = new JLabel(NORMAL_HOMUNCULUS_IMAGE);
    private final JLabel SHINY_HOMUNCULUS = new JLabel(SHINY_HOMUNCULUS_IMAGE);


    /**
     * Constructor that creates the framework of the actual game
     */
    public OriginsGUI() {

        this.setTitle("Origins");
        this.setSize(1200,700);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainImagePanel = new JPanel();
        mainImagePanel.setBounds(0, 0, 1200, 400);
        mainButtonPanel = new JPanel();
        mainButtonPanel.setLayout(null);
        mainButtonPanel.setBounds(0,400,600,300);
        mainTextPanel = new JPanel();
        mainTextPanel.setLayout(null);
        mainTextPanel.setBounds(600,400,600,300);

        attack = new JButton();
        attack.setBounds(75, 50, 100, 150);
        defend = new JButton();
        defend.setBounds(225, 50, 100, 150);
        heal = new JButton();
        heal.setBounds(375, 50, 100, 150);

        mainButtonPanel.add(heal);
        mainButtonPanel.add(attack);
        mainButtonPanel.add(defend);

        mainImagePanel.add(SHINY_ABOMINATION);
        heal.setVisible(true);
        attack.setVisible(true);
        defend.setVisible(true);

        this.add(mainImagePanel);
        this.add(mainButtonPanel);
        this.setIconImage(ORIGINS_ICON_IMAGE.getImage());
        this.setVisible(true);

    }
}
