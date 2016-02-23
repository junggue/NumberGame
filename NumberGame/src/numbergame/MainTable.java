/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author tzm5331
 */
public class MainTable implements ActionListener {
        JFrame mainFrame; 
        Container thisContainer;
        JPanel centerPanel, southPanel, northPanel; 
        JButton diamondsButton[][] = new JButton[6][5];
        JButton exitButton, resetButton, newlyButton; 
        JLabel fractionLable = new JLabel("0"); 
        JButton firstButton, secondButton; 
        int grid[][] = new int[3][3];
        static boolean pressInformation = false; 
        int x0 = 0, y0 = 0, x = 0, y = 0, fristMsg = 0, secondMsg = 0, validateLV; 
        int i, j, k, n;
        public void init() {
                mainFrame = new JFrame("Game");
                thisContainer = mainFrame.getContentPane();
                thisContainer.setLayout(new BorderLayout());
                centerPanel = new JPanel();
                southPanel = new JPanel();
                northPanel = new JPanel();
                thisContainer.add(centerPanel, "Center");
                thisContainer.add(southPanel, "South");
                thisContainer.add(northPanel, "North");
                centerPanel.setLayout(new GridLayout(3, 3));
                for (int cols = 0; cols < 3; cols++) {
                        for (int rows = 0; rows < 3; rows++) {
                                diamondsButton[cols][rows] = new JButton(
                                                String.valueOf(grid[cols + 1][rows + 1]));
                                diamondsButton[cols][rows].addActionListener(this);
                                centerPanel.add(diamondsButton[cols][rows]);
                        }
                }
                exitButton = new JButton("Exit");
                exitButton.addActionListener(this);
                resetButton = new JButton("Refresh");
                resetButton.addActionListener(this);
                newlyButton = new JButton("Play again");
                newlyButton.addActionListener(this);
                southPanel.add(exitButton);
                southPanel.add(resetButton);
                southPanel.add(newlyButton);
                fractionLable.setText(String.valueOf(Integer.parseInt(fractionLable
                                .getText())));
                northPanel.add(fractionLable);
                mainFrame.setBounds(280, 100, 500, 450);
                mainFrame.setVisible(true);
        }
        
        public void fraction() {
                fractionLable.setText(String.valueOf(Integer.parseInt(fractionLable
                                .getText()) + 100));
        }
        
        public void actionPerformed(ActionEvent e) {
                
        }
       
}
