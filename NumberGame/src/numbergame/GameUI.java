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
    private JPanel centerPanel, southPanel, northPanel, addtionalPanel;
    private JButton button[][], returnButton, refreshButton;
    private JLabel timeLabel, goalNumLabel, sumLabel, statusLabel;
    ImageIcon img1, img2, img3, img4, img5, img6;
    ImageIcon image;

    private Timer timer;
    private int delay;
    private int time;

    private Timer timer2;
    private int delay2;
    private int time2;

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
        southPanel.setLayout(new GridLayout(2, 1));
        northPanel.setLayout(new GridLayout(0, colNum));

        //Adding Lablels
        //Alex
        northPanel.add(goalNumLabel = new JLabel("Goal: " + theGameController.getGameModel().getGoalNum(), SwingConstants.CENTER));
        goalNumLabel.setFont(new Font("Serif", Font.BOLD, 30));
        northPanel.add(timeLabel = new JLabel("5", SwingConstants.CENTER));
        timeLabel.setFont(new Font("Serif", Font.BOLD, 40));
        northPanel.add(sumLabel = new JLabel("sum: " + theGameController.getGameModel().getSum(), SwingConstants.CENTER));
        sumLabel.setFont(new Font("Serif", Font.BOLD, 30));

        //Option Buttons and Listners
        //Lauren
        southPanel.add(statusLabel = new JLabel("", SwingConstants.CENTER));
        statusLabel.setPreferredSize(new Dimension(700, 60));
        statusLabel.setFont(new Font("Serif", Font.BOLD, 30));
        southPanel.add(addtionalPanel = new JPanel());
        addtionalPanel.add(returnButton = new JButton("return"));
        addtionalPanel.add(refreshButton = new JButton("refresh"));
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
                        button[rows][cols] = new JButton(getImage(1));
                        break;
                    case 2:
                        button[rows][cols] = new JButton(getImage(2));
                        break;
                    case 3:
                        button[rows][cols] = new JButton(getImage(3));
                        break;
                    case 4:
                        button[rows][cols] = new JButton(getImage(4));
                        break;
                    default:
                        button[rows][cols] = new JButton(getImage(5));
                        break;
                }

                button[rows][cols].addActionListener(this);
                centerPanel.add(button[rows][cols]);
            }
        }
    }

    // Because Image will be changed twice in a game  
    // (1. after 5 seconds after game started)
    // (2. to show the original apple image when the question button is clicked )
    // Creating this method was inevitable
    // Refactored by "Junggue Yang"
    public ImageIcon getImage(int num) {

        switch (num) {
            case 1:
                image = img1;
                break;
            case 2:
                image = img2;
                break;
            case 3:
                image = img3;
                break;
            case 4:
                image = img4;
                break;
            default:
                image = img5;
                break;
        }

        return image;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();

        for (int i = 0; i < theGameController.getGameModel().getGameMatrix().length; i++) {
            for (int j = 0; j < theGameController.getGameModel().getGameMatrix()[i].length; j++) {
                if (obj == button[i][j]) {
                    //check if the button has not been clicked yet
                    if (!theGameController.getGameModel().getOptionsChosen(i, j)) {

                        button[i][j].setIcon(getImage(theGameController.getGameModel().getGameMatrix()[i][j]));

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
                        statusLabel.setText(theGameController.getGameModel().errorMessage());
                        time2 = 0;
                        delay2 = 1000;
                        timer2 = new Timer(delay, this);
                        timer2.start();
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
                timeLabel.setText("START!!");
                for (int rows = 0; rows < theGameController.getGameModel().getGameMatrix().length; rows++) {
                    for (int cols = 0; cols < theGameController.getGameModel().getGameMatrix()[rows].length; cols++) {
                        button[rows][cols].setIcon(img6);
                    }
                }
            }
        }

        if (obj == timer2) {
            time2 += 1;
            if (time2 == 1) {
                statusLabel.setText("Choose Another");
                timer2.stop();
            }
        }

    }

}
