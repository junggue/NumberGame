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
    //private Container theContainer;
    private JPanel centerPanel, southPanel, northPanel, addtionalPanel, newNorthPanel;
    private JButton button[][], returnButton, refreshButton, instructionButton;
    private JLabel timeLabel, goalNumLabel, sumLabel, statusLabel;
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
        theImage = new Image();
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
                        sumLabel.setText("sum: " + theGameController.getGameModel().getSum());
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
        
        if(obj == instructionButton){
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
                timeLabel.setText("START!!");
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

    //Replaces labels created in initComponents method 
    //Now called from this method
    //Refactored by Alex
    public void addToNorthPanel() {
        goalNumLabel = new JLabel("", SwingConstants.CENTER);        
        timeLabel = new JLabel("", SwingConstants.CENTER);        
        sumLabel = new JLabel("", SwingConstants.CENTER);
        
        newNorthPanel = new JPanel();
        newNorthPanel.setLayout(new GridLayout(1,3));
        newNorthPanel.add(goalNumLabel = new JLabel("Goal: " + theGameController.getGameModel().getGoalNum()));
        newNorthPanel.add(timeLabel = new JLabel("5"));
        newNorthPanel.add(sumLabel = new JLabel("Sum: " + theGameController.getGameModel().getSum()));

        goalNumLabel.setFont(new Font("Serif", Font.BOLD, 20));
        timeLabel.setFont(new Font("Serif", Font.BOLD, 25));
        sumLabel.setFont(new Font("Serif", Font.BOLD, 20));        
        
        northPanel.add(newNorthPanel);
    }

    //Replaces the coding in the initComponents() method that now calls this method
    //This uses the extract method
    //Refactored by Lauren Ritter
    public void addToSouthPanel() {
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

}
