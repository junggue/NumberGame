/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author laurenritter
 */
public class Instructions extends JPanel{
    private JButton exitButton;
    private JButton backButton;
    private JButton startButton;
    GameController theGameController;
    private JLabel instructions;
    
    public Instructions(){
        JPanel instruct = new JPanel();
        
        instructions = new JLabel("Instructions");
        exitButton = new JButton("Exit");
        backButton = new JButton("Back to Main Screen");
        startButton = new JButton("Start Game!");
        
        instruct.add(exitButton);
        instruct.add(backButton);
        instruct.add(startButton);
    }
}
