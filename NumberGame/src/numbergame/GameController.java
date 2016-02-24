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
public class GameController {

    private Random random;
    private int[][] gameMatrix;
    private int[] options;
    private boolean[] optionsChosen;
    private boolean doneClicked;
    private int userSum;
    private int goalNumber;

    //by creating the controller, it will create an panel
    public GameController() {
        gameMatrix = new int[3][3];
        options = new int[9];
        optionsChosen = new boolean[9];
        doneClicked = false;
        goalNumber = getRandomNum(9, 36);

        //the options are not selected yet
        for (int i = 0; i < optionsChosen.length; i++) {
            optionsChosen[i] = false;
        }

        //assign random numbers in the matrix
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                gameMatrix[i][j] = getRandomNum(1, 5);
            }
        }

    }

    public void chooseOption() {

        Scanner scnr = new Scanner(System.in);
        int numChosen;

        while (!doneClicked) {
            System.out.println("choose from 1 to 9");
            numChosen = scnr.nextInt();
            if (optionsChosen[numChosen] == false) {
                optionsChosen[numChosen] = true;
                sumOptionsSelected(numChosen);

            } else {
                System.out.println("You already chose the number");
            }
        }
    }

    //for test
    public void printMatrix() {
        int num = 0;
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                System.out.print("["+ (num++) +"]");
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

    //draw apples at 9 spots with different numbers
    public void drawApples() {

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
