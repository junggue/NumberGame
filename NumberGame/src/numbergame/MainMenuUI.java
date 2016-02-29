/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author laurenritter
 */
public class MainMenuUI extends JPanel{
    private JPanel mainPanel;
    private JButton startButton;
    private JButton exitButton;
    private MainTable theMainTable;
    private JButton instructionsButton;
    private Instructions theInstructions;
    
    MainMenuUI(){
        mainPanel = new JPanel();
        
        initCustomComponents();
    }
    
    public void initCustomComponents(){
        exitButton = new JButton("Exit Game!");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });
        
        startButton = new JButton("Start Game!");
        startButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                startButtonActionPerformed(e);
            }
        });
        
        instructionsButton = new JButton("Instructions");
        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                instructionsButtonActionPerformed(e);
            }
        });
        
        mainPanel.add(exitButton);
        mainPanel.add(startButton);
        mainPanel.setVisible(true);
    }
    
    public void switchToInstructions(){
        theInstructions = (Instructions) new JPanel();
        theMainTable.mainFrame.removeAll();
        theMainTable.mainFrame.add(theInstructions);
    }
    
    public void switchToMainTable(){
        theMainTable.mainFrame.removeAll();
        theMainTable.mainFrame.add(theMainTable.northPanel, theMainTable.centerPanel);
    }
    
    public void exitButtonActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public void startButtonActionPerformed(ActionEvent e){
        switchToMainTable();
    }
    
    public void instructionsButtonActionPerformed(ActionEvent e){
        switchToInstructions();
    }
}
