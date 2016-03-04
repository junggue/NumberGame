/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aot5238
 */
public class Credits extends JPanel
{
    private JButton exitButton;
    private JButton backButton;
    private JLabel credits;
    private JLabel weAre;
    private JPanel panel;
    private MainMenuUI theMainMenu;
    private MainTable theMainTable;
    
    public Credits()
    {
        
        panel = new JPanel();
        
        credits = new JLabel("Credits");
        weAre = new JLabel("Here Is Who Made The Game!"
                + "Lauren Ritter"
                + "Junggue Chang"
                + "Tianyue Ma"
                + "Alex Taing"
                + "With Special Guest:"
                + "Professor Rimland!");
        exitButton = new JButton("Exit");
        backButton = new JButton("Back to Main Screen");

        exitButton.setIcon(new ImageIcon("images/exit.png"));
        backButton.setIcon(new ImageIcon("images/back.png"));
        
        panel.add(credits, BorderLayout.NORTH);
        panel.add(weAre, BorderLayout.CENTER);
        panel.add(exitButton, BorderLayout.SOUTH);
        panel.add(backButton, BorderLayout.SOUTH);
        
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        
        
        exitButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                exitButtonActionPerformed(e);
            }
        });
        
        backButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                backButtonActionPerformed(e);
            }
        });
        
    }
        
    public void switchToMainTable(){
        theMainTable.mainFrame.removeAll();
        theMainTable.mainFrame.add(theMainTable.centerPanel, theMainTable.northPanel);
        repaint();
        revalidate();
    }
    
    public void switchToMainMenu(){
        theMainMenu = (MainMenuUI) new JPanel();
        theMainTable.mainFrame.getContentPane().removeAll();
        theMainTable.mainFrame.add(theMainMenu);
        repaint();
        revalidate();
    }
        
    public void exitButtonActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public void backButtonActionPerformed(ActionEvent e){
        switchToMainMenu();
    }
    
    public void startButtonActionPerformed(ActionEvent e){
        switchToMainTable();
    }
    
}
