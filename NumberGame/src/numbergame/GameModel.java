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
    private boolean[][] cellsSelected;
    private int sum;
    private int goalNum;

    private Cell[][] cells;

    private final int COLUMN = 3;
    private final int ROW = 3;
    private final int MIN_RANDOM_NUM = 1;
    private final int MAX_RANDOM_NUM = 5;

    //by creating the controller, it will create a new game
    public GameModel() {

        gameMatrix = new int[ROW][COLUMN];
        cellsSelected = new boolean[ROW][COLUMN];

        setGoalNum(ROW * COLUMN * MIN_RANDOM_NUM, ROW * COLUMN * MAX_RANDOM_NUM / 2);

        //the options are not selected yet
        for (int i = 0; i < cellsSelected.length; i++) {
            for (int j = 0; j < cellsSelected[i].length; j++) {
                cellsSelected[i][j] = false;
            }
        }

        //assign random numbers in the matrix
        //deep copy the numbers in gameMatrix[x][y] to options[x*y]
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                gameMatrix[i][j] = getRandomNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            }
        }
        

    }

    public Cell[][] createCells() {
        cells = new Cell[COLUMN][ROW];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(getRandomNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM));
            }
        }

        return cells;
    }

    public int getNumOfColumn() {
        return COLUMN;
    }

    public int getNumOfRow() {
        return ROW;
    }

    public int getGoalNum() {
        return this.goalNum;
    }

    //used to set a new goalNum
    public void setGoalNum(int start, int end) {
        goalNum = getRandomNum(start, end);
    }

    public int getSum() {
        return this.sum;
    }

    public void sumSelectedNum(int r, int c) {
        if (cellsSelected[r][c] == false) {
            this.sum += gameMatrix[r][c];
        }
    }

    //-----------------needs to be refactored-----------------------------------
    public void regenerateGameMatrix() {
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                gameMatrix[i][j] = getRandomNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            }
        }
    }

    public int[][] getGameMatrix() {
        return gameMatrix;
    }

    public boolean getOptionsChosen(int r, int c) {
        return cellsSelected[r][c];
    }

    public void numButtonPushed(int r, int c) {
        this.cellsSelected[r][c] = true;
    }

//------------------------------------------------------------------------------
    public String checkResult() {
        if (this.goalNum == this.sum) {
            return "You Won";
        } else {
            return "You Lost";
        }
    }

    public String errorMessage() {
        return "Pushed already";
    }

    public int getRandomNum(int start, int end) {
        Random random = new Random();
        return showRandomInteger(start, end + 1, random);
    }

    private int showRandomInteger(int start, int end, Random random) {
        if (start > end) {
            throw new IllegalArgumentException("no exceed");
        }
        long range = (long) end - (long) start;
        long fraction = (long) (range * random.nextDouble());
        int randomNumber = (int) (fraction + start);
        return randomNumber;
    }

//    //test only
//    public void play() {
//
//        Scanner scnr = new Scanner(System.in);
//        int row, col;
//
//        System.out.println("Goal Number: " + goalNum);
//        printMatrix();
//
//        System.out.println("enter row:");
//        //user selects the option
//        row = scnr.nextInt();
//        System.out.println("enter column:");
//        col = scnr.nextInt();
//
//        if (cellsSelected[row][col] == false) {
//            //button is pushed and cannot pushed again: turning to true
//            numButtonPushed(row, col);
//            //sum the number
//            sumSelectedNum(row, col);
//        } else {
//            System.out.println(errorMessage());
//        }
//        System.out.println("sum: " + getSum());
//
//        System.out.println("Result Message: " + checkResult());
//    }
//    //test use only
//    public void printMatrix() {
//        int num = 0;
//        for (int i = 0; i < getGameMatrix().length; i++) {
//            for (int j = 0; j < getGameMatrix()[i].length; j++) {
//                System.out.print("[" + (num++) + "]");
//                System.out.print(getGameMatrix()[i][j]);
//            }
//            System.out.println();
//        }
//    }
}
