package numbergame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class MainTable implements ActionListener {
        JFrame mainFrame; 
        Container thisContainer;
        JPanel centerPanel, southPanel, northPanel; 
        JButton diamondsButton[][] = new JButton[3][3];
        JButton exitButton, resetButton, newlyButton; 
        JLabel fractionLable = new JLabel("0"); 
        int grid[][] = new int[8][7];
        int x0 = 0, y0 = 0, x = 0, y = 0, fristMsg = 0, secondMsg = 0, validateLV;
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
        public void randomBuild() {
                
        }
        public void fraction() {
              
        }
        public void reload() {
               
        }
        public void remove() {
                
        }
        public void actionPerformed(ActionEvent e) {
              
        }
       
}