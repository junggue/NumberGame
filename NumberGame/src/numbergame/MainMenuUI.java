/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
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
    private GameView theGameView;
    private JButton instructionsButton;
    private Instructions theInstructions;
    private GameUI theGameUI;
    
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
        
        ImageIcon exit = new ImageIcon("images/exit.png");
        JButton exitButton = new JButton(exit);
        mainPanel.add(exitButton);
        ImageIcon start = new ImageIcon("images/start.png");
        JButton startButton = new JButton(start);
        mainPanel.add(startButton);
        mainPanel.add(instructionsButton);
        mainPanel.setVisible(true);
    }
    
    public void switchToInstructions(){
        theInstructions = (Instructions) new JPanel();
        theGameView.removeAll();
        theGameView.add(theInstructions);
        repaint();
        revalidate();
    }
    
    public void switchToMainTable(){
        theGameUI = (GameUI) new JPanel();
        theGameView.removeAll();
        theGameView.add(theGameUI);
        repaint();
        revalidate();
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
