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

    private int[][] gameMatrix;
    private boolean[][] optionsChosen;
    private int[] options;
    private int sum;
    private int goalNum;

    private final int COLUMN = 3;
    private final int ROW = 3;
    private final int MIN_RANDOM_NUM = 1;
    private final int MAX_RANDOM_NUM = 5;

    //by creating the controller, it will create a new game
    public GameModel() {

        gameMatrix = new int[ROW][COLUMN];
        options = new int[ROW * COLUMN];
        optionsChosen = new boolean[ROW][COLUMN];

        setGoalNum(ROW * COLUMN * MIN_RANDOM_NUM, ROW * COLUMN * MAX_RANDOM_NUM / 2);

        //the options are not selected yet
        for (int i = 0; i < optionsChosen.length; i++) {
            for (int j = 0; j < optionsChosen[i].length; j++) {
                optionsChosen[i][j] = false;
            }
        }

        //assign random numbers in the matrix
        //deep copy the numbers in gameMatrix[x][y] to options[x*y]
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                gameMatrix[i][j] = getRandomNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
                options[i] = gameMatrix[i][j];
            }
        }

    }

    public void regenerateGameMatrix() {
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                gameMatrix[i][j] = getRandomNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
                options[i] = gameMatrix[i][j];
            }
        }
    }

    //test only
    public void play() {

        Scanner scnr = new Scanner(System.in);
        int row, col;

        System.out.println("Goal Number: " + goalNum);
        printMatrix();

        System.out.println("enter row:");
        //user selects the option
        row = scnr.nextInt();
        System.out.println("enter column:");
        col = scnr.nextInt();

        if (optionsChosen[row][col] == false) {
            //button is pushed and cannot pushed again: turning to true
            numButtonPushed(row, col);
            //sum the number
            sumSelectedNum(row, col);
        } else {
            System.out.println(errorMessage());
        }
        System.out.println("sum: " + getSum());

        System.out.println("Result Message: " + checkResult());
    }

    public int[][] getGameMatrix() {
        return gameMatrix;
    }

    public int getGoalNum() {
        return this.goalNum;
    }

    public boolean getOptionsChosen(int r, int c) {
        return optionsChosen[r][c];
    }

    //used to set a new goalNum
    public void setGoalNum(int start, int end) {
        goalNum = getRandomNum(start, end);
    }

    public int getSum() {
        return this.sum;
    }

    public String checkResult(){
        if (this.goalNum == this.sum) {
            return "You Won";
        } else {
            return "You Lost";
        }
    }

    //test use only
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

    public void sumSelectedNum(int r, int c) {
        if (optionsChosen[r][c] == false) {
            this.sum += gameMatrix[r][c];
        }
    }

    public void numButtonPushed(int r, int c) {
        this.optionsChosen[r][c] = true;
    }

    public String errorMessage() {
        return "pushed already. Push another";
    }

    //with range 1 ~ 5
    public static int getRandomNum(int start, int end) {
        Random random = new Random();
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
     * @return the COLUMN
     */
    public int getNumOfColumn() {
        return COLUMN;
    }

    /**
     * @return the ROW
     */
    public int getNumOfRow() {
        return ROW;
    }
}
