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
    private boolean doneClicked;
    private int userSum;
    private int goalNumber;

    private final int COLUMN = 3;
    private final int RAW = 3;
    private final int MIN_RANDOM_NUM = 1;
    private final int MAX_RANDOM_NUM = 5;

    //by creating the controller, it will create an panel
    public GameModel() {

        gameMatrix = new int[RAW][COLUMN];
        options = new int[RAW * COLUMN];
        optionsChosen = new boolean[RAW * COLUMN];
        doneClicked = false;
        goalNumber = getRandomNum(RAW * COLUMN * MIN_RANDOM_NUM, RAW * COLUMN * MAX_RANDOM_NUM);

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

        while (!doneClicked) {
            System.out.println("Goal Number: " + goalNumber);
            System.out.println("choose from 1 to 9");
            numChosen = scnr.nextInt();
            if (optionsChosen[numChosen] == false) {
                optionsChosen[numChosen] = true;
                sumOptionsSelected(numChosen);
            } else {
                System.out.println("You already chose the number");
            }
            System.out.println("sum: " + getSum());
            getDoneClicked();
        }

        System.out.println("Result Message: " + checkResult());
    }

    public int getSum() {
        return this.userSum;
    }

    public boolean getDoneClicked() {
        return doneClicked;
    }

    public void setDoneClicked(boolean newValue) {
        this.doneClicked = newValue;
    }

    public void dontButtonClicked() {
        this.doneClicked = true;
    }

    public String checkResult() {
        if (this.goalNumber == this.userSum) {
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
                this.userSum += gameMatrix[0][0];
                break;
            case 1:
                this.userSum += gameMatrix[0][1];
                break;
            case 2:
                this.userSum += gameMatrix[0][2];
                break;
            case 3:
                this.userSum += gameMatrix[1][0];
                break;
            case 4:
                this.userSum += gameMatrix[1][1];
                break;
            case 5:
                this.userSum += gameMatrix[1][2];
                break;
            case 6:
                this.userSum += gameMatrix[2][0];
                break;
            case 7:
                this.userSum += gameMatrix[2][1];
                break;
            case 8:
                this.userSum += gameMatrix[2][2];
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
