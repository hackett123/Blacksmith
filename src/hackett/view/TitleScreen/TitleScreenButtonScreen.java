package hackett.view.TitleScreen;

import hackett.view.GuiHandler;

import javax.swing.*;
import java.awt.*;

public abstract class TitleScreenButtonScreen {
    private GuiHandler guiHandler;
    private JFrame frame;
    private JPanel headerPanel, gamePanel, gamePanelCopy, statusPanel, newGamePanel;

    TitleScreenButtonScreen(GuiHandler guiHandler) {
        this.guiHandler = guiHandler;
        initFields();
        frame.remove(gamePanel);
        frame.add(newGamePanel);
    }

    public abstract void referencePointers();

    JFrame getFrame() {
        return this.frame;
    }
    JPanel getHeaderPanel() {
        return this.headerPanel;
    }
    JPanel getGamePanel() {
        return this.gamePanel;
    }
    JPanel getGamePanelCopy() {
        return this.gamePanelCopy;
    }
    JPanel getStatusPanel() {
        return this.statusPanel;
    }
    JPanel getNewGamePanel() {
        return this.newGamePanel;
    }

    public abstract void addComponents();

    private void initFields() {
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

}
