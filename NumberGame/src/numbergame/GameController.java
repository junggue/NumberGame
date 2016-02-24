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
    private int[][] gameMatrix;
    private int[] options;
    private boolean[] optionsChosen;
    
    private int userSum;        
    private int goalNumber;
    
    //by creating the controller, it will create an panel
    public GameController(){
        gameMatrix = new int[3][3];
        options = new int[9];
        optionsChosen = new boolean[9];
        goalNumber = getRandomNum(9,36);
        
        //the options are not selected yet
        for(int i = 0;i<optionsChosen.length;i++){
            optionsChosen[i] = false;
        }
        
        for(int i = 0;i<gameMatrix.length;i++){
            for(int j = 0;j<gameMatrix[i].length;j++){
                gameMatrix[i][j] = getRandomNum(1,4);
            }
        }
        
        
    }
    
    public void chooseOption(){    
        System.out.println("choose from 1 to 9");
        
        
    }
    
    public void sumOptionsSelected(){
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

