/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
        
        add(instructions);
        add(whatToDo);
        add(exitButton);
        add(backButton);
        add(startButton);

        exitButton.addActionListener(this);
        backButton.addActionListener(this);
        startButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonClicked = e.getSource();
        if(buttonClicked == exitButton){
            System.exit(0);
        }
        if(buttonClicked == startButton){
            theGameView.showGameUI(this);
        }
        if(buttonClicked == backButton){
            theGameView.showMainMenuUI(this);
        }
    }

}
