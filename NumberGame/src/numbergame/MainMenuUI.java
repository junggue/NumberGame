/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author laurenritter
 */
public class MainMenuUI extends JFrame{
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JButton startButton;
    GameCntl theGameCntl;
    
    MainMenuUI(){
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        startButton = new JButton("Start Game!");
        
        mainFrame.add(mainPanel);
        mainPanel.add(startButton);
        
        startButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                startButtonActionPerformed(e);
            }
        });
    }
    
    public void startButtonActionPerformed(ActionEvent e){
        
    }
}
