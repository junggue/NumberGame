package numbergame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class MainTable{
        JFrame mainFrame; 
        Container thisContainer;
        JPanel centerPanel, southPanel, northPanel; 
        JButton diamondsButton[][] = new JButton[3][3];
        JButton exitButton, resetButton, newlyButton, finishButton;
        JButton instructionsButton, mainMenuButton;
        JLabel fractionLable;
        JLabel answerLabel;
        MainMenuUI theMainMenu;
        Instructions theInstructions;

        int[][] gameMatrix;
        

        
        private GameController theGameCntl;
        
        public MainTable(GameController parentGameCntl){
            theGameCntl = parentGameCntl;
            init();
        
        }
        
        
        
        public void init() {
                mainFrame = new JFrame("Game");
                thisContainer = mainFrame.getContentPane();
                thisContainer.setLayout(new BorderLayout());
                centerPanel = new JPanel();
                southPanel = new JPanel();
                northPanel = new JPanel();
                thisContainer.add(centerPanel, "Center");
                thisContainer.add(southPanel, "South");
                thisContainer.add(northPanel, "North");
                centerPanel.setLayout(new GridLayout(3, 3));
                
                gameMatrix = theGameCntl.getGameModel().getGameMatrix();
                
                //putting random number
                for (int rows = 0; rows < gameMatrix.length; rows++) {
                        for (int cols = 0; cols < gameMatrix[rows].length; cols++) {
                                diamondsButton[rows][cols] = new JButton(""+gameMatrix[rows][cols]);
                                diamondsButton[rows][cols].addActionListener(new java.awt.event.ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        diamondsButtonActionPerformed(e);
                                    }
                                });
                                centerPanel.add(diamondsButton[rows][cols]);
                        }
                }
          
                fractionLable = new JLabel(""+theGameCntl.getGameModel().getGoalNum());
                answerLabel = new JLabel(""+theGameCntl.getGameModel().statusResult());
                exitButton = new JButton("Exit");
                exitButton.addActionListener(new java.awt.event.ActionListener(){
                      public void actionPerformed(ActionEvent e ){
                          exitButtonActionPerformed(e);
                      }
                });
                
                finishButton = new JButton("Get Result");
                finishButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        finishButtonActionPerformed(e);
                    }
                });
                
//                newlyButton = new JButton("Play again");
//                newlyButton.addActionListener(new java.awt.event.ActionListener() {
//                    public void actionPerformed(ActionEvent e) {
//                        newlyButtonActionPerformed(e);
//                    }
//                });
                
                instructionsButton = new JButton("Instructions");
                instructionsButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        instructionsButtonActionPerformed(e);
                    }    
                });
                
                mainMenuButton = new JButton("Main Menu");
                mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        mainMenuButtonActionPerformed(e);
                    }
                });
                
                southPanel.add(mainMenuButton);
                southPanel.add(instructionsButton);
                southPanel.add(exitButton);
                southPanel.add(finishButton);
                southPanel.add(answerLabel);
//                southPanel.add(newlyButton);
                northPanel.add(fractionLable);
                mainFrame.setBounds(280, 100, 500, 450);
                mainFrame.setVisible(true);
        }
        
        public void SwitchPanelToInstructions(){
            theInstructions = (Instructions) new JPanel();
            mainFrame.getContentPane().removeAll();
            mainFrame.getContentPane().add(theInstructions);
        }
        
        public void SwitchPanelToMainMenu(){
            theMainMenu = (MainMenuUI) new JPanel();
            mainFrame.getContentPane().removeAll();
            mainFrame.getContentPane().add(theMainMenu);
        }
        
        public void mainMenuButtonActionPerformed(ActionEvent e){
            SwitchPanelToMainMenu();
        }
        
        public void instructionsButtonActionPerformed(ActionEvent e){
            SwitchPanelToInstructions();
        }

        public void exitButtonActionPerformed(ActionEvent e) {
              System.exit(0);
        }

        public void diamondsButtonActionPerformed(ActionEvent e){
            System.out.print(e.getActionCommand());
        }
        
        public void finishButtonActionPerformed(ActionEvent e){
            this.theGameCntl.getGameModel().setFinishButtonClicked(true);
            if(this.equals(theGameCntl.getGameModel().getGoalNum())){
                theGameCntl.getGameModel().statusResult();
            }
        }
       
}