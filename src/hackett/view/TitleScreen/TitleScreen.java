package hackett.view.TitleScreen;

import hackett.view.GuiHandler;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TitleScreen {

    private GuiHandler guiHandler;

    private static int WIDTH;
    private static int HEIGHT;

    private JFrame frame;
    private JPanel headerPanel, gamePanel, statusPanel;

    public TitleScreen(GuiHandler guiHandler) {

        this.guiHandler = guiHandler;
        WIDTH = GuiHandler.getWidth();
        HEIGHT = GuiHandler.getHeight();

        buildTitleScreen();

    }

    public JFrame getFrame() {
        return this.frame;
    }
    public GuiHandler getGuiHandler() {
        return this.guiHandler;
    }
    public JPanel getGamePanel() {
        return this.gamePanel;
    }
    public JPanel getHeaderPanel() {
        return this.headerPanel;
    }
    public JPanel getStatusPanel() {
        return this.statusPanel;
    }


    private void buildTitleScreen() {

        frame = new JFrame("Blacksmith's Apprentice");
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        headerPanel = new JPanel();
        gamePanel = new JPanel();
        statusPanel = new JPanel();

        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(gamePanel, BorderLayout.CENTER);
        frame.add(statusPanel, BorderLayout.SOUTH);

        headerPanel.setBackground(Color.BLACK);
        gamePanel.setBackground(Color.WHITE);
        statusPanel.setBackground(Color.CYAN);

        configureStartPanels();

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void configureStartPanels() {
        configureHeaderStart();
        configureGameStart();
        configureStatusStart();
    }

    private void configureHeaderStart() {

        JLabel title, credits, contact;

        title = new JLabel("BLACKSMITH'S APPRENTICE", SwingConstants.CENTER);
        title.setFont(new Font("Courier New", Font.BOLD, 24));
        title.setForeground(Color.WHITE);

        credits = new JLabel("Created by MHSProductions");
        credits.setFont(new Font("Courier New", Font.ITALIC, 12));
        credits.setForeground(Color.WHITE);

        contact = new JLabel("Contact Us: mhsproductions.com, mhsproductions1@gmail.com");
        contact.setFont(new Font("Courier New", Font.PLAIN, 12));
        contact.setForeground(Color.WHITE);

        GridLayout grid = new GridLayout(3, 1);
        headerPanel.setLayout(grid);

        headerPanel.add(title);
        headerPanel.add(credits);
        headerPanel.add(contact);


    }

    private void configureGameStart() {

        JLabel welcomeText, instructionsText;
        JButton newGame, loadGame, settings, credits;

        ArrayList<JLabel> gameLabels = new ArrayList<>();
        ArrayList<JButton> gameButtons = new ArrayList<>();

        welcomeText = new JLabel("Welcome to Blacksmith's Apprentice!", SwingConstants.CENTER);
        welcomeText.setFont(new Font("Courier New", Font.BOLD, 18));
        welcomeText.setForeground(Color.DARK_GRAY);

        instructionsText = new JLabel("Choose from one of the options below to begin:", SwingConstants.CENTER);
        instructionsText.setFont(new Font("Courier New", Font.ITALIC, 16));
        instructionsText.setForeground(Color.DARK_GRAY);

        gameLabels.add(welcomeText);
        gameLabels.add(instructionsText);

        newGame = new JButton("New Game");
        newGame.addActionListener(l -> new NewGame(this.guiHandler));

        loadGame = new JButton("Load Game");
        loadGame.addActionListener(l -> new LoadGame(this.guiHandler));

        settings = new JButton("Settings");
        settings.addActionListener(l -> new Settings(this.guiHandler));

        credits = new JButton("Credits");
        credits.addActionListener(l -> new Credits(this.guiHandler));

        gameButtons.add(newGame);
        gameButtons.add(loadGame);
        gameButtons.add(settings);
        gameButtons.add(credits);

        for (JButton gameButton : gameButtons) {
            gameButton.setFont(new Font("Courier New", Font.BOLD, 16));
            gameButton.setBackground(Color.DARK_GRAY);
            gameButton.setForeground(Color.WHITE);
            gameButton.setOpaque(true);
            gameButton.setBorderPainted(true);
            gameButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true));
        }

        GridLayout grid = new GridLayout(4, 4);
        grid.setHgap(WIDTH / 10);
        grid.setVgap(HEIGHT / 10);
        gamePanel.setLayout(grid);

        gamePanel.add(welcomeText);
        gamePanel.add(instructionsText);
        gamePanel.add(newGame);
        gamePanel.add(loadGame);
        gamePanel.add(settings);
        gamePanel.add(credits);
    }

    private void configureStatusStart() {

        JLabel version;

        version = new JLabel("Version 1.0.0, Released Summer 2018");
        version.setFont(new Font("Courier New", Font.ITALIC, 12));
        version.setForeground(Color.BLACK);

        statusPanel.add(version);

    }

}
