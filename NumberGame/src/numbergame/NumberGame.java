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

        GameFrame theGameFrame = new GameFrame();
        GameController g = new GameController();

        //test the random number generator
        System.out.println(g.getRandomNum(1, 5));
        System.out.println(g.getRandomNum(1, 5));
        System.out.println(g.getRandomNum(1, 5));
        System.out.println(g.getRandomNum(1, 5));
        System.out.println(g.getRandomNum(1, 5));
    }
}
