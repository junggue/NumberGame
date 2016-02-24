/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

/**
 *
 * @author junggue
 */
import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel {

    private Apple apple;
    private Box box;
    private GameController theGameController;
    private JButton testButton;
    private int randomNum;

    public GamePanel() {

        super();
        theGameController = new GameController();
        apple = new Apple(30);
        box = new Box(30);

        testButton = new JButton("4" + theGameController.getRandomNum(1, 6));
        this.add(testButton, "CENTER");

    }

    public void initComponents() {

    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        apple.paintComponent(g, 40, 40);
        box.paintComponent(g, 40, 40);

    }

}
