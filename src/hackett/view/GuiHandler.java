package hackett.view;

import hackett.controller.GameController;
import hackett.view.TitleScreen.TitleScreen;

import javax.swing.*;

public class GuiHandler implements Runnable {

    private GameController gameController;
    private JFrame mainframe;
    private JPanel headerPanel, gamePanel, statusPanel;


    private static final int WIDTH = 1080;
    private static final int HEIGHT = 640;

    public GuiHandler(GameController gameController) {
        this.gameController = gameController;
    }

    public static int getWidth() {
        return WIDTH;
    }
    public static int getHeight() {
        return HEIGHT;
    }
    public JFrame getMainframe() {
        return this.mainframe;
    }
    public JPanel getHeaderPanel() {
        return this.headerPanel;
    }
    public JPanel getGamePanel() {
        return this.gamePanel;
    }
    public JPanel getStatusPanel() {
        return this.statusPanel;
    }
    public GameController getGameController() {
        return this.gameController;
    }

    @Override
    public void run() {
        TitleScreen titleScreen = new TitleScreen(this);
        mainframe = titleScreen.getFrame();
        headerPanel = titleScreen.getHeaderPanel();
        gamePanel = titleScreen.getGamePanel();
        statusPanel = titleScreen.getStatusPanel();
    }

}
