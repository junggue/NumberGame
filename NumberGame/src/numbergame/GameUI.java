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

public class GameUI extends JPanel{

    private GameController theGameController;
    private Container theContainer;
    private JPanel centerPanel, southPanel, northPanel;
    private JButton button[][], exitButton, getResultButton;
    private JLabel statusLabel, goalNumLabel, sumLabel;
    private Instructions theInstructions;
    private MainMenuUI theMainMenu;
    private JButton mainMenuButton;
    private JButton instructionsButton;
    private GameView theGameView;

    public GameUI(GameController parentGameController) {
        super();
        theGameController = parentGameController;
        initComponents();
    }

    public void initComponents() {

        int rowNum = theGameController.getGameModel().getNumOfRow();
        int colNum = theGameController.getGameModel().getNumOfColumn();

        //All about the Layout here
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

        northPanel.add(statusLabel = new JLabel("status"));
        northPanel.add(goalNumLabel = new JLabel("Goal: " + theGameController.getGameModel().getGoalNum()));
        northPanel.add(sumLabel = new JLabel("sum: " + theGameController.getGameModel().getSum()));
        
        southPanel.add(instructionsButton = new JButton("Instructions"));
        southPanel.add(mainMenuButton = new JButton("Main Menu"));
        southPanel.add(exitButton = new JButton("Exit"));

        //Buttons are initialized
        button = new JButton[rowNum][colNum];

        //Store the random numbers into the buttons
        //Then, the buttons are added into the centerPanel
        for (int rows = 0; rows < theGameController.getGameModel().getGameMatrix().length; rows++) {
            for (int cols = 0; cols < theGameController.getGameModel().getGameMatrix()[rows].length; cols++) {
                button[rows][cols] = new JButton("" + theGameController.getGameModel().getGameMatrix()[rows][cols]);
                button[rows][cols].addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        buttonActionPerformed(e);
                    }
                });
                centerPanel.add(button[rows][cols]);
            }
        }
        
        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                instructionsButtonActionPerformed(e);
            }
        });
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenuButtonActionPerformed(e);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });
    }

    public void buttonActionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        for (int i = 0; i < theGameController.getGameModel().getGameMatrix().length; i++) {
            for (int j = 0; j < theGameController.getGameModel().getGameMatrix()[i].length; j++) {
                if (obj == button[i][j]) {
                    //theGameController.getGameModel().numButtonPushed(i, j);
                    theGameController.getGameModel().sumSelectedNum(i, j);
                    sumLabel.setText("sum: " + theGameController.getGameModel().getSum());
                }
            }
        }
    }
    
    public void instructionsButtonActionPerformed(ActionEvent e){
        switchToInstructions();
    }
    
    public void mainMenuButtonActionPerformed(ActionEvent e){
        switchToMainMenuUI();
    }
    
    public void exitButtonActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public void switchToInstructions(){
        theGameView.removeAll();
        theGameView.add(theInstructions);
        repaint();
        revalidate();
    }
    
    public void switchToMainMenuUI(){
        theGameView.removeAll();
        theGameView.add(theMainMenu);
        repaint();
        revalidate();
    }
}
