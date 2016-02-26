/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author laurenritter
 */
public class MainMenuUI extends JFrame{
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JButton startButton;
    private MainTable theMainTable;
    private NavigationCntl theNavigationCntl;
    
    MainMenuUI(){
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        
        initCustomComponents();
    }
    
    public void initCustomComponents(){
        this.setLocationRelativeTo(null);
        this.setSize(350, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainFrame.add(mainPanel);
        
        startButton = new JButton("Start Game!");
        startButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                startButtonActionPerformed(e);
            }
        });
        
        mainPanel.add(startButton);
        
        mainFrame.setVisible(true);
    }
    
    public void startButtonActionPerformed(ActionEvent e){
        theNavigationCntl.toMainTable();
    }
}
