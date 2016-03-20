/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aot5238
 */
public class Credits extends JPanel implements ActionListener
{
    private JButton exitButton;
    private JButton backButton;
    private JLabel credits;
    private JLabel weAre;
    private GameView theGameView;
    
    public Credits(GameView parentGameView)
    {
        super();
        theGameView = parentGameView;
        initCustomComponents();
    }
    
    
    public void initCustomComponents()
    {
        credits = new JLabel("Credits");
        weAre = new JLabel("Here Is Who Made The Game!" + " "
                + "Lauren Ritter" + " "
                + "Junggue Chang" + " "
                + "Tianyue Ma" + " "
                + "Alex Taing" + " "
                + "With Special Guest: "
                + "Professor Rimland!");
        exitButton = new JButton();
        backButton = new JButton();
        
        exitButton.setPreferredSize(new Dimension(100,50));
        backButton.setPreferredSize(new Dimension(100,50));

        exitButton.setIcon(new ImageIcon("images/rsz_exit.png"));
        backButton.setIcon(new ImageIcon("images/rsz_back.png"));
        
        
        add(credits, BorderLayout.NORTH);
        add(weAre, BorderLayout.CENTER);
        add(exitButton, BorderLayout.SOUTH);
        add(backButton, BorderLayout.SOUTH);
        
        exitButton.addActionListener(this);
        backButton.addActionListener(this);
        
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonClicked = e.getSource();
        
        if(buttonClicked == exitButton){
            System.exit(0);
            
        if(buttonClicked == backButton){
            theGameView.showMainMenuUI(this);
        }
        }
    }
}
