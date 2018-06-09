package hackett.view.TitleScreen;

import hackett.view.GuiHandler;
import hackett.view.StartGameView;

import javax.swing.*;
import java.awt.*;

public class NewGame {

    private GuiHandler guiHandler;
    private JFrame frame;
    private JPanel headerPanel, gamePanel, gamePanelCopy, statusPanel, newGamePanel;

    public NewGame(GuiHandler guiHandler) {
        this.guiHandler = guiHandler;
        initFields();

        frame.remove(gamePanel);
        frame.add(newGamePanel);

        addComponents();

        frame.revalidate();
    }

    public void initFields() {
        this.frame = guiHandler.getMainframe();
        this.headerPanel = guiHandler.getHeaderPanel();
        this.gamePanel = guiHandler.getGamePanel();
        this.gamePanelCopy = new JPanel();

        for (Component c : gamePanel.getComponents()) {
            gamePanelCopy.add(c);
        }

        this.statusPanel = guiHandler.getStatusPanel();
        newGamePanel = new JPanel();
    }

    public void addComponents() {
        JLabel nameLabel, difficultyLabel;
        JTextArea nameTA, difficultyTA;
        JButton go, back;

        GridLayout grid = new GridLayout(3, 2);
        grid.setHgap(100);
        grid.setVgap(100);

        newGamePanel.setLayout(grid);

        nameLabel = new JLabel("What's your name?");
        nameLabel.setFont(new Font("Courier New", Font.BOLD, 18));
        nameLabel.setForeground(Color.DARK_GRAY);

        newGamePanel.add(nameLabel);

        nameTA = new JTextArea();
        nameTA.setBackground(Color.BLACK);
        nameTA.setForeground(Color.WHITE);
        nameTA.setPreferredSize(new Dimension(200, 25));

        newGamePanel.add(nameTA);

        difficultyLabel = new JLabel("Difficulty: Type easy, medium, or hard.");
        difficultyLabel.setFont(new Font("Courier New", Font.BOLD, 18));
        difficultyLabel.setForeground(Color.DARK_GRAY);

        newGamePanel.add(difficultyLabel);

        difficultyTA = new JTextArea();
        difficultyTA.setBackground(Color.BLACK);
        difficultyTA.setForeground(Color.WHITE);
        difficultyTA.setPreferredSize(new Dimension(200, 25));

        newGamePanel.add(difficultyTA);

        go = new JButton("Submit");
        go.addActionListener(l -> {
            new StartGameView(this.guiHandler);
            guiHandler.getGameController().startGame();
        });

        back = new JButton("Return to title page");
        back.addActionListener(l -> {
            frame.remove(newGamePanel);
            frame.add(gamePanelCopy);
            frame.revalidate();
        });


        newGamePanel.add(go);
        newGamePanel.add(back);

    }

}
