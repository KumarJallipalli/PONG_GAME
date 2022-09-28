package PongGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int initailSpeed = 2;

    Ball (int x, int y, int WIDTH, int HEIGHT) {
        super(x, y, WIDTH, HEIGHT);
        random = new Random();

        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection * initailSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection * initailSpeed);
    }

    public void setXDirection (int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection (int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move () {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw (Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, height, width);
    }
}
