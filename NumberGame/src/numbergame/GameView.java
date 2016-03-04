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

    public GameView(GameController parentGameController) {
        theMainMenu = new MainMenuUI();
        theInstructions = new Instructions();
        theGameCntroller = parentGameController;
        theGameUI = new GameUI(parentGameController);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initCustomComponents();
        
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                try{
                    GameView MainFrame = new GameView(parentGameController);
                    MainFrame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void initCustomComponents(){
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(theGameUI);
        //GameUI theGamePanel = new GameUI(theGameCntl);
        //MainTable theMainTable = new MainTable(theGameCntl);
        //getContentPane().add(theGamePanel, "Center");
        
        
        //setLayout(new BorderLayout());
    //setContentPane(new JLabel(new ImageIcon("images/homescreen.png")));
        //setLayout(new FlowLayout());
        
    }
}
