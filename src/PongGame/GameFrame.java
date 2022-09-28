package PongGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GameFrame extends JFrame {

    GamePanel panel;

    GameFrame () {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("PONG GAME");
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }
}
