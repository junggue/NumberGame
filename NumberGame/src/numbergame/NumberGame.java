/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

/**
 *
 * @author laurenritter
 */
public class NumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //MainTable mt = new MainTable();
        //mt.init();

        //GameFrame theGameFrame = new GameFrame();
        GameModel g = new GameModel();

        //test the random number generator
        g.printMatrix();
        
        g.chooseOption();
        
        
        System.out.println();
    }
}
