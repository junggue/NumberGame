/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.util.Random;
import java.awt.*;
import javax.swing.*;


public class GameController {
    
    private Apple apple;
    private GamePanel theGamePanel;
    
    public GameController(){
        theGamePanel = new GamePanel();
    }
    
    public void drawPanel(){    
    }
    
    public void deletePanel(){
        
    }
    

    //draw apples at 9 spots with different numbers
    public void drawApples(){
    }
    
    //with range 1 ~ 5
    public int getRandomNum(int start, int end, Random random){
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
