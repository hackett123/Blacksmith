package hackett.view;

import hackett.controller.GameController;

import javax.swing.*;
import java.awt.*;

public class GuiHandler implements Runnable {

    private GameController gameController;

    private JFrame frame;
    private JPanel headerPanel, gamePanel, statusPanel;

    public GuiHandler(GameController gameController) {
        this.gameController = gameController;
    }

    @Override
    public void run() {
        frame = new JFrame("Blacksmith's Apprentice");
        frame.setPreferredSize(new Dimension(1080, 640));

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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void configureStartPanels() {
        configureHeaderStart();
        configureGameStart();
        configureStatusStart();
    }
    private void configureHeaderStart() {
        JLabel title = new JLabel("BLACKSMITH'S APPRENTICE");
        title.setFont(new Font("Courier New", Font.BOLD, 24));
        title.setForeground(Color.WHITE);

        JLabel credits = new JLabel("Created by MHSProductions");
        credits.setFont(new Font("Courier New", Font.ITALIC, 12));
        credits.setForeground(Color.WHITE);

        JLabel version = new JLabel("Version 1.0.0, Released Summer 2018");
        version.setFont(new Font("Courier New", Font.ITALIC, 12));
        version.setForeground(Color.WHITE);
        headerPanel.add(title);
        headerPanel.add(credits);
        headerPanel.add(version);
    }
    private void configureGameStart() {

    }
    private void configureStatusStart() {

    }


}
