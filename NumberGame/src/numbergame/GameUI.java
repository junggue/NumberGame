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
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameUI extends JPanel implements ActionListener {

    private GameController theGameController;
    private Container theContainer;
    private JPanel centerPanel, southPanel, northPanel;
    private JButton button[][], hideButton, returnButton, refreshButton;
    private JLabel statusLabel, goalNumLabel, sumLabel;
    ImageIcon img6;

    public GameUI(GameController parentGameController) {
        super();
        theGameController = parentGameController;
        initComponents();
    }

    public void initComponents() {

        int rowNum = theGameController.getGameModel().getNumOfRow();
        int colNum = theGameController.getGameModel().getNumOfColumn();

        //All about the Layout
        this.setLayout(new BorderLayout());
        centerPanel = new JPanel();
        southPanel = new JPanel();
        northPanel = new JPanel();
        this.add(centerPanel, "Center");
        this.add(southPanel, "South");
        this.add(northPanel, "North");
        centerPanel.setLayout(new GridLayout(rowNum, colNum));
        southPanel.setLayout(new GridLayout(0, colNum));
        northPanel.setLayout(new GridLayout(0, colNum));

        //Adding Lablels
        northPanel.add(statusLabel = new JLabel("status"));
        northPanel.add(goalNumLabel = new JLabel("Goal: " + theGameController.getGameModel().getGoalNum()));
        northPanel.add(sumLabel = new JLabel("sum: " + theGameController.getGameModel().getSum()));

        //Option Buttons
        southPanel.add(hideButton = new JButton("Hide the apples"));
        southPanel.add(returnButton = new JButton("return"));
        southPanel.add(refreshButton = new JButton("refresh"));
        hideButton.addActionListener(this);

        //Buttons are initialized
        button = new JButton[rowNum][colNum];

        ImageIcon img1 = new ImageIcon("src/images/1.png");
        ImageIcon img2 = new ImageIcon("src/images/2.png");
        ImageIcon img3 = new ImageIcon("src/images/3.png");
        ImageIcon img4 = new ImageIcon("src/images/4.png");
        ImageIcon img5 = new ImageIcon("src/images/5.png");
        img6 = new ImageIcon("src/images/question.png");

        //Store the random numbers into the buttons
        //Then, the buttons are added into the centerPanel
        for (int rows = 0; rows < theGameController.getGameModel().getGameMatrix().length; rows++) {
            for (int cols = 0; cols < theGameController.getGameModel().getGameMatrix()[rows].length; cols++) {
                switch (theGameController.getGameModel().getGameMatrix()[rows][cols]) {
                    case 1:
                        button[rows][cols] = new JButton(img1);
                        break;
                    case 2:
                        button[rows][cols] = new JButton(img2);
                        break;
                    case 3:
                        button[rows][cols] = new JButton(img3);
                        break;
                    case 4:
                        button[rows][cols] = new JButton(img4);
                        break;
                    default:
                        button[rows][cols] = new JButton(img5);
                        break;
                }

                button[rows][cols].addActionListener(this);
                centerPanel.add(button[rows][cols]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        if (obj == hideButton) {
            for (int rows = 0; rows < theGameController.getGameModel().getGameMatrix().length; rows++) {
                for (int cols = 0; cols < theGameController.getGameModel().getGameMatrix()[rows].length; cols++) {
                    button[rows][cols].setIcon(img6);
                }
            }
        }

        for (int i = 0; i < theGameController.getGameModel().getGameMatrix().length; i++) {
            for (int j = 0; j < theGameController.getGameModel().getGameMatrix()[i].length; j++) {
                if (obj == button[i][j]) {
                    //check if the button has not been clicked yet
                    if (!theGameController.getGameModel().getOptionsChosen(i, j)) {
                        //sum
                        theGameController.getGameModel().sumSelectedNum(i, j);
                        //show the sum in the label
                        sumLabel.setText("sum: " + theGameController.getGameModel().getSum());
                        //the boolean matrix changes current button to true so it cannot be used twice
                        if (theGameController.getGameModel().getGoalNum()
                                == theGameController.getGameModel().getSum()) {
                            statusLabel.setText("You Won");
                        } else if (theGameController.getGameModel().getGoalNum()
                                < theGameController.getGameModel().getSum()) {
                            statusLabel.setText("You Lost");
                        } else {
                        }

                        theGameController.getGameModel().numButtonPushed(i, j);
                    }
                }
            }
        }

    }

}
