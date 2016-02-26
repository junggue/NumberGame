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
public class GameCntl {
    
    public GameModel theGameModel;
    private GameView theGameView;
    private MainTable theMainTable;
    
    public GameCntl(){
    
        //theGameView = new GameView(this);
        theMainTable = new MainTable(this);
        theGameModel = new GameModel();
        theGameView.setVisible(true);
        theGameModel.printMatrix();
        theGameModel.play();
        
        
    }
    
}
