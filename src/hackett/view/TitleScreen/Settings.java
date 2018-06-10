package hackett.view.TitleScreen;

import hackett.view.GuiHandler;

import javax.swing.*;

public class Settings extends TitleScreenButtonScreen {

    private GuiHandler guiHandler;
    private JFrame frame;
    private JPanel headerPanel, gamePanel, gamePanelCopy, statusPanel, newGamePanel;

    Settings(GuiHandler guiHandler) {
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

    }

}
