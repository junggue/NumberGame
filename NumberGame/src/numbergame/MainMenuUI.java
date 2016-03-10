/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author laurenritter
 */
public class MainMenuUI extends JPanel implements ActionListener{
//    private JPanel mainPanel;

    private JButton startButton, exitButton, instructionButton;
    private Instructions theInstructions;
    private GameView theGameView;
    

    public MainMenuUI(GameView parentGameView) {
        super();
        theGameView = parentGameView;
        initCustomComponents();
    }

    public void initCustomComponents() {
        startButton = new JButton("Start Game!");
        exitButton = new JButton("Exit Game!");
        instructionButton = new JButton("Instruction");
        
        startButton.addActionListener(this);
        exitButton.addActionListener(this);

        add(startButton);
        add(instructionButton);
        add(exitButton);
        
    }
    
    public void actionPerformed(ActionEvent event){
        Object obj = event.getSource();
        if(obj == startButton){
            theGameView.showGameUI(this);
        }
        if(obj == exitButton){
            System.exit(0);
        }
    }
}