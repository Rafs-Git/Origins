package game.origins;


import javax.swing.*;
import java.util.PropertyResourceBundle;

/**
 * <p>
 * Creates a GUI for the actual game!
 * </p>
 */
public class OriginsGUI extends JFrame{


    //data members
    private JPanel mainImagePanel;
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
        this.setIconImage(ORIGINS_ICON_IMAGE.getImage());
        this.setVisible(true);


    }
}
