package numbergame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author junggue
 */
public class GameController {

    private GameModel theGameModel;
    private GameView theGameView;

    public GameController() {
        theGameView = new GameView(this);
        theGameView.setVisible(true);
    }

    public GameModel getGameModel() {
        return theGameModel;
    }

    public void generateNewGameModel() {
        theGameModel = new GameModel();
    }
}