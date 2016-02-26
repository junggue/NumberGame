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
    private final int RAW = 3;
    private final int MIN_RANDOM_NUM = 1;
    private final int MAX_RANDOM_NUM = 5;

    //by creating the controller, it will create an panel
    public GameModel() {

        gameMatrix = new int[RAW][COLUMN];
        options = new int[RAW * COLUMN];
        optionsChosen = new boolean[RAW * COLUMN];
        finishButtonClicked = false;
        goalNum = getRandomNum(RAW * COLUMN * MIN_RANDOM_NUM, RAW * COLUMN * MAX_RANDOM_NUM);

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

    public void chooseOption() {

        Scanner scnr = new Scanner(System.in);
        int numChosen;

        while (!finishButtonClicked) {
            System.out.println("Goal Number: " + goalNum);
            System.out.println("choose from 1 to 9");
            //user selects the option
            numChosen = scnr.nextInt();
            if (optionsChosen[numChosen] == false) {
                optionsChosen[numChosen] = true;
                sumOptionsSelected(numChosen);
            } else {
                System.out.println("You already chose the number");
            }
            System.out.println("sum: " + getSum());
            getFinishButtonClicked();
        }

        System.out.println("Result Message: " + checkResult());
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
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                System.out.print("[" + (num++) + "]");
                System.out.print(gameMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public void sumOptionsSelected(int numChosen) {
        switch (numChosen) {
            case 0:
                this.sum += gameMatrix[0][0];
                break;
            case 1:
                this.sum += gameMatrix[0][1];
                break;
            case 2:
                this.sum += gameMatrix[0][2];
                break;
            case 3:
                this.sum += gameMatrix[1][0];
                break;
            case 4:
                this.sum += gameMatrix[1][1];
                break;
            case 5:
                this.sum += gameMatrix[1][2];
                break;
            case 6:
                this.sum += gameMatrix[2][0];
                break;
            case 7:
                this.sum += gameMatrix[2][1];
                break;
            case 8:
                this.sum += gameMatrix[2][2];
                break;
            default:
                System.out.println("wrong number");
                break;

        }
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

}
