package hackett.controller;

import hackett.main.Father;
import hackett.model.ModelManager;
import hackett.view.GuiHandler;

import javax.swing.*;

public class GameController {

    private Father father;
    private ModelManager modelManager;
    private GuiHandler guiHandler;

    public GameController(Father father) {
        this.father = father;
        this.modelManager = new ModelManager(this);
        SwingUtilities.invokeLater(this.guiHandler = new GuiHandler(this));
    }

    public void startGame() {

    }

}
