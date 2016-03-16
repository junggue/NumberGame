/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author laurenritter
 */
public class Instructions extends JPanel implements ActionListener{
    private JButton exitButton;
    private JButton backButton;
    private JButton startButton;
    private JLabel instructions;
    private JLabel whatToDo;
    private JPanel panel;
    private MainMenuUI theMainMenu;
    private GameUI theGameUI;
    private GameView theGameView;
    
    public Instructions(GameView parentGameView){
        super();
        theGameView = parentGameView;
        initCustomComponents();
    }
    
    //Took this method out of the constructor in order top clear up code
    //Uses the extract method
    //Refactored by Lauren Ritter
    public void initCustomComponents(){       
        instructions = new JLabel("Instructions");
        whatToDo = new JLabel("On the top of the screen you will see a number along with 'apples' containing numbers. Click the apples with the correct numbers to reach the goal number.");
        exitButton = new JButton("Exit");
        backButton = new JButton("Back to Main Screen");
        startButton = new JButton("Start Game!");
        
        panel.add(instructions, BorderLayout.NORTH);
        panel.add(whatToDo, BorderLayout.CENTER);
        panel.add(exitButton, BorderLayout.SOUTH);
        panel.add(backButton, BorderLayout.SOUTH);
        panel.add(startButton, BorderLayout.SOUTH);
        
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        
        backButton = new JButton("Back");
        backButton.addActionListener(this);
        
        startButton = new JButton("Start Game!");
        startButton.addActionListener(this);
        
        panel.setVisible(true);
    }
    
    public void exitButtonActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public void startButtonActionPerformed(ActionEvent e){
        
    }
    
    public void backButtonActionPerformed(ActionEvent e){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        startButtonActionPerformed(e);
        backButtonActionPerformed(e);
        exitButtonActionPerformed(e);
    }

}
