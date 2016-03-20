/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Container;
import java.awt.Dimension;
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

    private JButton startButton, exitButton, instructionButton, creditsButton;
    private Instructions theInstructions;
    private Credits theCredits;
    private GameView theGameView;
    

    public MainMenuUI(GameView parentGameView) {
        super();
        theGameView = parentGameView;
        initCustomComponents();
    }

    public void initCustomComponents() {
        startButton = new JButton("Start Game!");
        exitButton = new JButton("Exit Game!");
        instructionButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
        
        startButton.addActionListener(this);
        exitButton.addActionListener(this);
        instructionButton.addActionListener(this);
        creditsButton.addActionListener(this);
        
        exitButton.setPreferredSize(new Dimension(100,50));
        instructionButton.setPreferredSize(new Dimension(100,50));
        startButton.setPreferredSize(new Dimension(100,50));
        creditsButton.setPreferredSize(new Dimension(100,50));

        exitButton.setIcon(new ImageIcon("images/rsz_exit.png"));
        instructionButton.setIcon(new ImageIcon("images/rsz_back.png"));
        startButton.setIcon(new ImageIcon("images/rsz_start.png"));    
        creditsButton.setIcon(new ImageIcon("images/rsz_credits.png"));
        
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        instructionButton.setOpaque(false);
        instructionButton.setContentAreaFilled(false);
        instructionButton.setBorderPainted(false);
        startButton.setOpaque(false);
        startButton.setContentAreaFilled(false);
        startButton.setBorderPainted(false);
        creditsButton.setOpaque(false);
        creditsButton.setContentAreaFilled(false);
        creditsButton.setBorderPainted(false);

        add(startButton);
        add(instructionButton);
        add(creditsButton);
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
        if(obj == instructionButton){
            theGameView.showInstruction(this);
        }
        if(obj == creditsButton){
            theGameView.showCredits(this);
        }
    }
}