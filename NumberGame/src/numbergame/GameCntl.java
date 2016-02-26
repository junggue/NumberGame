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
    
    private GameModel theGameModel;
    private GameView theGameView;
    
    public GameCntl(){
    
        theGameView = new GameView(this);
        theGameModel = new GameModel();
        theGameView.setVisible(true);
        theGameModel.play();
        
    }
    
}
