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

public class GameUI extends JPanel {

    private Apple apple;
    private Box box;
    private GameCntl theGameCntl;
    private JButton testButton;
    private int randomNum;

    public GameUI() {
    }

    public GameUI(GameCntl parentGameCntl) {

        super();
        theGameCntl = parentGameCntl;
        initComponents();

    }

    public void initComponents() {
        this.setSize(700, 700);
        testButton = new JButton("");

    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        requestFocusInWindow();

    }

    protected void paintComponent(Graphics g) {
        int h = getHeight();
        int w = getWidth();
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(w / 2, h / 2, w, h);
    }

}
