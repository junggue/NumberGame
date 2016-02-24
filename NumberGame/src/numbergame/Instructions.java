/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import javax.swing.JButton;
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
    
    public Instructions(){
        exitButton = new JButton("Exit");
        backButton = new JButton("Back to Main Screen");
        startButton = new JButton("Start Game!");
        System.out.println("On the top of the screen you will see a number along with 'apples' containing numbers. Click the apples with the correct numbers to reach the goal number.");
        this.add(exitButton);
        this.add(backButton);
        this.add(startButton);
    }
}
