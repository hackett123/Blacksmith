package hackett.view.TitleScreen;

import hackett.view.GuiHandler;
import hackett.view.StartGameView;

import javax.swing.*;
import java.awt.*;

public class NewGame extends TitleScreenButtonScreen {

    private GuiHandler guiHandler;
    private JFrame frame;
    private JPanel gamePanelCopy, newGamePanel;

    NewGame(GuiHandler guiHandler) {
        super(guiHandler);
        this.guiHandler = guiHandler;
        referencePointers();
        addComponents();
        frame.validate();
    }

    @Override
    public void referencePointers() {
        this.frame = super.getFrame();
        this.gamePanelCopy = super.getGamePanelCopy();
        this.newGamePanel = super.getNewGamePanel();
    }

    @Override
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
