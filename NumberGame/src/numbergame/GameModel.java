/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author laurenritter
 */
public class GameModel {

    private Random random;
    private int[][] gameMatrix;
    private int[] options;
    private boolean[] optionsChosen;
    private boolean finishButtonClicked;
    private int sum;
    private int goalNum;

    private final int COLUMN = 3;
    private final int ROW = 3;
    private final int MIN_RANDOM_NUM = 1;
    private final int MAX_RANDOM_NUM = 5;

    //by creating the controller, it will create an panel
    public GameModel() {

        gameMatrix = new int[ROW][COLUMN];
        options = new int[ROW * COLUMN];
        optionsChosen = new boolean[ROW * COLUMN];
        finishButtonClicked = false;
        goalNum = getRandomNum(ROW * COLUMN * MIN_RANDOM_NUM, ROW * COLUMN * MAX_RANDOM_NUM/2);

        //the options are not selected yet
        for (int i = 0; i < optionsChosen.length; i++) {
            optionsChosen[i] = false;
        }

        //assign random numbers in the matrix
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                gameMatrix[i][j] = getRandomNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            }
        }

    }

    public void play() {

        Scanner scnr = new Scanner(System.in);
        int numChosen;

        while (!finishButtonClicked) {
            System.out.println("Goal Number: " + goalNum);
            System.out.println("choose from 1 to 9");
            //user selects the option
            numChosen = scnr.nextInt();
            printMatrix();
            
            if (optionsChosen[numChosen] == false) {
                //button is pushed and cannot pushed again: turning to true
                numButtonPushed(numChosen);
                //sum the number
                sumOptionsSelected(numChosen);
            } else {
                System.out.println(errorMessage());
            }
            System.out.println("sum: " + getSum());
            getFinishButtonClicked();
        }

        System.out.println("Result Message: " + checkResult());
    }
    
    public int getGoalNum(){
        return this.goalNum;
    }

    public int getSum() {
        return this.sum;
    }

    public boolean getFinishButtonClicked() {
        return finishButtonClicked;
    }

    public void setFinishButtonClicked(boolean newValue) {
        this.finishButtonClicked = newValue;
    }

    //finishing the game
    public void finishButtonClicked() {
        this.finishButtonClicked = true;
    }

    public String checkResult() {
        if (this.goalNum == this.sum) {
            return "You Won";
        } else {
            return "You Lost";
        }
    }
    
    

    //for test
    public void printMatrix() {
        int num = 0;
        for (int i = 0; i < getGameMatrix().length; i++) {
            for (int j = 0; j < getGameMatrix()[i].length; j++) {
                System.out.print("[" + (num++) + "]");
                System.out.print(getGameMatrix()[i][j]);
            }
            System.out.println();
        }
    }

    public void sumOptionsSelected(int numChosen) {
        switch (numChosen) {
            case 0:
                this.sum += getGameMatrix()[0][0];
                break;
            case 1:
                this.sum += getGameMatrix()[0][1];
                break;
            case 2:
                this.sum += getGameMatrix()[0][2];
                break;
            case 3:
                this.sum += getGameMatrix()[1][0];
                break;
            case 4:
                this.sum += getGameMatrix()[1][1];
                break;
            case 5:
                this.sum += getGameMatrix()[1][2];
                break;
            case 6:
                this.sum += getGameMatrix()[2][0];
                break;
            case 7:
                this.sum += getGameMatrix()[2][1];
                break;
            case 8:
                this.sum += getGameMatrix()[2][2];
                break;
            default:
                System.out.println("wrong number");
                break;

        }
    }
    
    public void numButtonPushed(int optionNum) {
        this.optionsChosen[optionNum] = true;
    }
    
    public String errorMessage(){
        return "You already chose the number";
    }

    //with range 1 ~ 5
    public int getRandomNum(int start, int end) {
        random = new Random();
        return showRandomInteger(start, end + 1, random);
    }

    private static int showRandomInteger(int start, int end, Random random) {
        if (start > end) {
            throw new IllegalArgumentException("no exceed");
        }
        long range = (long) end - (long) start;
        long fraction = (long) (range * random.nextDouble());
        int randomNumber = (int) (fraction + start);
        return randomNumber;
    }

    /**
     * @return the gameMatrix
     */
    public int[][] getGameMatrix() {
        return gameMatrix;
    }

}
