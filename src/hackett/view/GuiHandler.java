package hackett.view;

import hackett.controller.GameController;
import hackett.view.TitleScreen.TitleScreen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GuiHandler implements Runnable {

    private GameController gameController;


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

    @Override
    public void run() {
        TitleScreen titleScreen = new TitleScreen(this);

    }

}
