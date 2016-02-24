/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.util.Random;

/**
 *
 * @author laurenritter
 */
public class GameController {
    
    private Random random;
    
    //by creating the controller, it will create an panel
    public GameController(){
    
    }
    
    public void drawPanel(){    
    }
    
    public void deletePanel(){
    }
    

    //draw apples at 9 spots with different numbers
    public void drawApples(){
        
    }
    
    //with range 1 ~ 5
    public int getRandomNum(int start, int end){
        random = new Random();
        return showRandomInteger(start, end, random);
    }
    
    private static int showRandomInteger(int start, int end, Random random){
        if (start > end){
            throw new IllegalArgumentException("no exceed");
        }
        long range = (long)end - (long)start;
        long fraction = (long)(range * random.nextDouble());
        int randomNumber = (int)(fraction + start);
        return randomNumber;
    }
    
    
}
