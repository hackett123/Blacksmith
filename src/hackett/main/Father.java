package hackett.main;

import hackett.controller.GameController;

import javax.swing.*;

public class Father {

    public Father() {
        GameController gc = new GameController(this);
    }

    public static void main(String[] args) {
        new Father();
    }


}
