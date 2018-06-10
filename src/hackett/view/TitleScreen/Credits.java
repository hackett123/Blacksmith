package hackett.view.TitleScreen;

import hackett.view.GuiHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Credits extends TitleScreenButtonScreen {

    private GuiHandler guiHandler;
    private JFrame frame;
    private JPanel headerPanel, gamePanel, gamePanelCopy, statusPanel, newGamePanel;

    Credits(GuiHandler guiHandler) {
        super(guiHandler);
        this.guiHandler = guiHandler;
        referencePointers();
        addComponents();
        frame.validate();
    }

    @Override
    public void referencePointers() {
        this.frame = super.getFrame();
        this.headerPanel = super.getHeaderPanel();
        this.gamePanel = super.getGamePanel();
        this.gamePanelCopy = super.getGamePanelCopy();
        this.statusPanel = super.getStatusPanel();
        this.newGamePanel = super.getNewGamePanel();
    }

    @Override
    public void addComponents() {
        JLabel game, gameCredit, music, musicCredit, graphics, graphicsCredit, story, storyCredit;
        ArrayList<JLabel> compList = new ArrayList<>();
        ArrayList<JLabel> creditList = new ArrayList<>();
        String gameCreator, musicCreator, graphicsCreator, storyCreator;

        GridLayout grid = new GridLayout(4, 2);

        newGamePanel.setLayout(grid);

        gameCreator = "Michael Hackett";
        musicCreator = "Michael Hackett";
        graphicsCreator = "Michael Hackett";
        storyCreator = "Michael Hackett";


        game = new JLabel("Game Development by:");
        music = new JLabel("Original Music Compositions by:");
        graphics = new JLabel("Graphical Design by:");
        story = new JLabel("Story Design by:");

        compList.add(game);
        compList.add(music);
        compList.add(graphics);
        compList.add(story);

        gameCredit = new JLabel(gameCreator);
        musicCredit = new JLabel(musicCreator);
        graphicsCredit = new JLabel(graphicsCreator);
        storyCredit = new JLabel(storyCreator);

        creditList.add(gameCredit);
        creditList.add(musicCredit);
        creditList.add(graphicsCredit);
        creditList.add(storyCredit);


        for (JLabel label : compList) {
            label.setFont(new Font("Courier New", Font.BOLD, 18));
        }
        for (JLabel label : creditList) {
            label.setFont(new Font("Courier New", Font.ITALIC, 18));
        }

        newGamePanel.add(game);
        newGamePanel.add(gameCredit);
        newGamePanel.add(music);
        newGamePanel.add(musicCredit);
        newGamePanel.add(graphics);
        newGamePanel.add(graphicsCredit);
        newGamePanel.add(story);
        newGamePanel.add(storyCredit);

    }


}
