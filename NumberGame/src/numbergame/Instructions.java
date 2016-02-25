/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.BorderLayout;
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
public class Instructions extends JFrame implements ActionListener{
    private JButton exitButton;
    private JButton backButton;
    private JButton startButton;
    private JLabel instructions;
    private JLabel whatToDo;
    private JPanel panel;
    
    public Instructions(){
        panel = new JPanel();
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
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
        
        exitButton.addActionListener(this);
        backButton.addActionListener(this);
        startButton.addActionListener(this);
        
        panel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
