/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author junggue
 */
public class GameView extends JFrame {

    private GameController theGameController;
    private GameUI theGameUI;
    private MainMenuUI theMainMenuUI;

    public GameView(GameController parentGameController) {
        theGameController = parentGameController;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initCustomComponents();
        showMainMenuUI();

    }

    public void initCustomComponents() {
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showGameUI(JPanel previousUI) {
        previousUI.revalidate();
        previousUI.repaint();
        remove(previousUI);
        theGameController.generateNewGameModel();
        theGameUI = new GameUI(theGameController, this);
        this.add(theGameUI);

    }

    public void showMainMenuUI() {
        theMainMenuUI = new MainMenuUI(this);
        this.add(theMainMenuUI);
    }

    public void showMainMenuUI(JPanel previousUI) {
        previousUI.revalidate();
        previousUI.repaint();
        theMainMenuUI = new MainMenuUI(this);
        this.add(theMainMenuUI);
        remove(previousUI);
    }

    public void exitTheGame() {
        System.exit(0);
    }

}