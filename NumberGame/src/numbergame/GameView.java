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

    private GameController theGameCntl;

    public GameView(GameController parentGameCntl) {
        
        theGameCntl = parentGameCntl;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initCustomComponetns();
        
        

    }
    
    public void initCustomComponetns(){
        this.setSize(900,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //GameUI theGamePanel = new GameUI(theGameCntl);
        //MainTable theMainTable = new MainTable(theGameCntl);
        //getContentPane().add(theGamePanel, "Center");
        
        
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("images/homescreen.png")));
        setLayout(new FlowLayout());
        
    }
}
