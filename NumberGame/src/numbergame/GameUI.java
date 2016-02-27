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
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GameUI extends JPanel {

    private GameController theGameController;
    private Container theContainer;
    private JPanel centerPanel, southPanel, northPanel;

    public GameUI(GameController parentGameController) {
        super();
        theGameController = parentGameController;
        initComponents();
    }

    public void initComponents() {

        //All about the Layout here
        theContainer.setLayout(new BorderLayout());
        centerPanel = new JPanel();
        southPanel = new JPanel();
        northPanel = new JPanel();
        theContainer.add(centerPanel, "Center");
        theContainer.add(southPanel, "South");
        theContainer.add(northPanel, "North");
        centerPanel.setLayout(new GridLayout(3, 3));
        
        //Buttons are initialized
        JButton button[][] = new JButton[3][3];

        //Store the random numbers into the buttons
        //Then, the buttons are added into the centerPanel
        for (int rows = 0; rows < theGameController.getGameModel().getGameMatrix().length; rows++) {
            for (int cols = 0; cols < theGameController.getGameModel().getGameMatrix()[rows].length; cols++) {
                button[rows][cols] = new JButton("" + theGameController.getGameModel().getGameMatrix()[rows][cols]);
                button[rows][cols].addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //diamondsButtonActionPerformed(e);
                    }
                });
                centerPanel.add(button[rows][cols]);
            }
        }

    }
//
//    public void paint(Graphics g) {
//        super.paintComponent(g);
//        requestFocusInWindow();
//
//    }
//
//    protected void paintComponent(Graphics g) {
//        int h = getHeight();
//        int w = getWidth();
//        super.paintComponent(g);
//        g.setColor(Color.RED);
//        g.fillOval(w / 2, h / 2, w, h);
//    }

}
