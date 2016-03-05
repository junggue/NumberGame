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

    public GameView(GameController parentGameController) {
        theGameCntroller = parentGameController;
        theGameUI = new GameUI(parentGameController);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initCustomComponetns();
    }

    public void initCustomComponetns() {
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(theGameUI);
    }
}
