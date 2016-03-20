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
    private Image theImage;
    private JPanel centerPanel, southPanel, northPanel, addtionalPanel;
    private JButton button[][], returnButton, refreshButton, instructionButton;
    private JLabel timeLabel, goalNumLabel, sumLabel, statusLabel;

    //Timer displaying apples for 5 seconds
    private Timer timer;
    private int delay;
    private int time;

    //Timer displaying alert when a cell is pushed again. 
    private Timer timer2;
    private int time2;

    private int rowNum;
    private int colNum;

    public GameUI(GameController parentGameController, GameView parentGameView) {

        theGameController = parentGameController;
        theGameView = parentGameView;
        theImage = new Image();

        rowNum = theGameController.getGameModel().getNumOfRow();
        colNum = theGameController.getGameModel().getNumOfColumn();

        time = 5;
        delay = 1000;
        timer = new Timer(delay, this);
        timer.start();

        initComponents();

    }

    public void initComponents() {

        //setting the layout
        //extract method
        //Junggue
        setLayout();

        //Adding Lablels
        //Created new method for northPanel
        //Refactored by Alex
        addToNorthPanel();

        //Created new method for south panel content
        //Uses the extract method
        //Refactored by Lauren Ritter
        addToSouthPanel();

        //Buttons are initialized
        button = new JButton[rowNum][colNum];

        //Store the random numbers into the buttons
        //Then, the buttons are added into the centerPanel
        for (int rows = 0; rows < theGameController.getGameModel().getCells().length; rows++) {
            for (int cols = 0; cols < theGameController.getGameModel().getCells()[rows].length; cols++) {
                switch (theGameController.getGameModel().getCells()[rows][cols].getNumOfApple()) {
                    case 1:
                        button[rows][cols] = new JButton(theImage.getImage(1));
                        break;
                    case 2:
                        button[rows][cols] = new JButton(theImage.getImage(2));
                        break;
                    case 3:
                        button[rows][cols] = new JButton(theImage.getImage(3));
                        break;
                    case 4:
                        button[rows][cols] = new JButton(theImage.getImage(4));
                        break;
                    default:
                        button[rows][cols] = new JButton(theImage.getImage(5));
                        break;
                }

                button[rows][cols].addActionListener(this);
                centerPanel.add(button[rows][cols]);
            }
        }
    }

    //setting the layout
    //extract method
    //Junggue
    private void setLayout() {
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
    }

    //Replaces labels created in initComponents method 
    //Now called from this method
    //Refactored by Alex
    //Refactored again by Junggue Yang
    private void addToNorthPanel() {
        northPanel.add(goalNumLabel = new JLabel("Goal: " + theGameController.getGameModel().getGoalNum(), SwingConstants.CENTER));
        goalNumLabel.setFont(new Font("Serif", Font.BOLD, 30));
        northPanel.add(timeLabel = new JLabel("5", SwingConstants.CENTER));
        timeLabel.setFont(new Font("Serif", Font.BOLD, 40));
        northPanel.add(sumLabel = new JLabel("sum: " + theGameController.getGameModel().getSum(), SwingConstants.CENTER));
        sumLabel.setFont(new Font("Serif", Font.BOLD, 30));
    }

    //Replaces the coding in the initComponents() method that now calls this method
    //This uses the extract method
    //Refactored by Lauren Ritter
    private void addToSouthPanel() {
        statusLabel = new JLabel("", SwingConstants.CENTER);
        statusLabel.setPreferredSize(new Dimension(700, 60));
        statusLabel.setFont(new Font("Serif", Font.BOLD, 30));

        addtionalPanel = new JPanel();
        addtionalPanel.add(returnButton = new JButton("Return to Main Menu"));
        addtionalPanel.add(refreshButton = new JButton("Refresh"));
        addtionalPanel.add(instructionButton = new JButton("Instructions"));

        returnButton.addActionListener(this);
        refreshButton.addActionListener(this);
        instructionButton.addActionListener(this);

        southPanel.add(statusLabel);
        southPanel.add(addtionalPanel);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();

        for (int i = 0; i < theGameController.getGameModel().getCells().length; i++) {
            for (int j = 0; j < theGameController.getGameModel().getCells()[i].length; j++) {
                if (obj == button[i][j]) {
                    //check if the button has not been clicked yet
                    if (!theGameController.getGameModel().getCells()[i][j].getCellStatus()) {

                        button[i][j].setIcon(theImage.getImage(theGameController.getGameModel().getCells()[i][j].getNumOfApple()));

                        //sum
                        theGameController.getGameModel().sumSelectedNum(i, j);
                        //show the sum in the label
                        sumLabel.setText("Sum: " + theGameController.getGameModel().getSum());
                        //the boolean matrix changes current button to true so it cannot be used twice
                        if (theGameController.getGameModel().getGoalNum()
                                == theGameController.getGameModel().getSum()) {
                            timeLabel.setText("You Won");
                        }
                        // Refactored. using empty else is not efficient way
                        // so I created two if statements rather than writing if, else if, else
                        // refactored by "Junggue Yang"                   
                        if (theGameController.getGameModel().getGoalNum()
                                < theGameController.getGameModel().getSum()) {
                            timeLabel.setText("You Lost");
                        }
                        theGameController.getGameModel().getCells()[i][j].cellSelected();
                    } else {
                        statusLabel.setText(theGameController.getGameModel().errorMessage());
                        time2 = 0;
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

        if (obj == instructionButton) {
            theGameView.showInstruction(this);
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
                timeLabel.setText("Start!!");
                for (int rows = 0; rows < theGameController.getGameModel().getCells().length; rows++) {
                    for (int cols = 0; cols < theGameController.getGameModel().getCells()[rows].length; cols++) {
                        button[rows][cols].setIcon(theImage.getQuestionImage());
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
