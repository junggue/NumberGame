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
    private GameView theGameView;
    //private Container theContainer;
    private JPanel centerPanel, southPanel, northPanel;
    private JButton button[][], returnButton, refreshButton;
    private JLabel timeLabel, goalNumLabel, sumLabel, resultLabel;
    ImageIcon img1, img2, img3, img4, img5, img6;

    private Timer timer;
    private int delay;
    private int time;

    public GameUI(GameController parentGameController, GameView parentGameView) {
        super();
        theGameController = parentGameController;
        theGameView = parentGameView;
        delay = 1000;
        initComponents();
        timer = new Timer(delay, this);
        time = 5;
        timer.start();

    }

    public void initComponents() {

        int rowNum = theGameController.getGameModel().getNumOfRow();
        int colNum = theGameController.getGameModel().getNumOfColumn();

        //All about the Layout
        //Junggue
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
        //Alex
        //timeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        northPanel.add(timeLabel = new JLabel("5"));
        timeLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        northPanel.add(goalNumLabel = new JLabel("Goal: " + theGameController.getGameModel().getGoalNum()));
        northPanel.add(sumLabel = new JLabel("sum: " + theGameController.getGameModel().getSum()));

        //Option Buttons and Listners
        //Lauren
        southPanel.add(resultLabel = new JLabel("Result"));
        southPanel.add(returnButton = new JButton("return"));
        southPanel.add(refreshButton = new JButton("refresh"));
        returnButton.addActionListener(this);
        refreshButton.addActionListener(this);

        //Buttons are initialized
        button = new JButton[rowNum][colNum];

        //initialize image objects with images
        //Owen
        img1 = new ImageIcon("src/images/1.png");
        img2 = new ImageIcon("src/images/2.png");
        img3 = new ImageIcon("src/images/3.png");
        img4 = new ImageIcon("src/images/4.png");
        img5 = new ImageIcon("src/images/5.png");
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

    // 
    //
    //  refactored by "name"
    public void initImage() {

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();

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
                            timeLabel.setText("You Won");
                        }
                        // Refactored. using empty else is not efficient way
                        // so I created two if statements rather than writing if, else if, else
                        // refactroed by "Junggue Yang"                      
                        if (theGameController.getGameModel().getGoalNum()
                                < theGameController.getGameModel().getSum()) {
                            timeLabel.setText("You Lost");
                        }
                        theGameController.getGameModel().numButtonPushed(i, j);
                    } else {
                        timeLabel.setText(theGameController.getGameModel().errorMessage());
                    }
                }
            }
        }

        if (obj == returnButton) {
            theGameView.showMainMenuUI(this);
        }

        if (obj == refreshButton) {
            theGameView.showGameUI(this);
        }

        if (obj == timer) {

            time = time - 1;
            if (time == 4) {
                timeLabel.setText("" + time);
            }
            if (time == 3) {
                timeLabel.setText("" + time);
            }
            if (time == 2) {
                timeLabel.setText("" + time);
            }
            if (time == 1) {
                timeLabel.setText("" + time);
            }
            if (time == 0) {
                timeLabel.setText("" + time);
                for (int rows = 0; rows < theGameController.getGameModel().getGameMatrix().length; rows++) {
                    for (int cols = 0; cols < theGameController.getGameModel().getGameMatrix()[rows].length; cols++) {
                        button[rows][cols].setIcon(img6);
                    }
                }
            }

        }

    }

}
