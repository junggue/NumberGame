/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author junggue
 */
public class GameView extends JFrame {

    private GameController theGameCntroller;
    private GameUI theGameUI;
    private MainMenuUI theMainMenu;
    private Instructions theInstructions;
    private JFrame frame;

    public GameView(GameController parentGameController) {
        frame = new JFrame();
        theMainMenu = new MainMenuUI();
        theInstructions = new Instructions();
        theGameCntroller = parentGameController;
        theGameUI = new GameUI(parentGameController);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initCustomComponents();
    }
    
    public void initCustomComponents(){
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(theGameUI);
        //GameUI theGamePanel = new GameUI(theGameCntl);
        //MainTable theMainTable = new MainTable(theGameCntl);
        //getContentPane().add(theGamePanel, "Center");
        
        
        //setLayout(new BorderLayout());
    //setContentPane(new JLabel(new ImageIcon("images/homescreen.png")));
        //setLayout(new FlowLayout());
        
    }
    
    public void switchToMainMenu(){
        frame.removeAll();
        frame.add(new MainMenuUI());
        repaint();
        revalidate();
    }
    
    public void switchToInstructions(){
        frame.removeAll();
        frame.add(new Instructions());
        repaint();
        revalidate();
    }
}
