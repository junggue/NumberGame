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
        JLabel fractionLable;
        JLabel answerLabel;
        MainMenuUI theMainMenu;
        Instructions theIntructions;

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
                answerLabel = new JLabel(""+theGameCntl.getGameModel().checkResult());
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
                southPanel.add(exitButton);
                southPanel.add(finishButton);
                southPanel.add(answerLabel);
//                southPanel.add(newlyButton);
                northPanel.add(fractionLable);
                mainFrame.setBounds(280, 100, 500, 450);
                mainFrame.setVisible(true);
        }
        
        public void SwitchPanels(){
            mainFrame.getContentPane().removeAll();
            
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
                theGameCntl.getGameModel().checkResult();
            }
        }
       
}