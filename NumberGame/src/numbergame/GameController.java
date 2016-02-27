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
    private MainTable theMainTable;

    public GameController() {
        theGameModel = new GameModel();
        theGameView = new GameView(this);
        theGameView.setVisible(true);
        
        //theMainTable = new MainTable(this);
        //theGameModel.printMatrix();
        //theGameModel.play();
    }

    public GameModel getGameModel() {
        return theGameModel;
    }

}
