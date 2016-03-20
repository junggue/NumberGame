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

    private int sum;
    private int goalNum;

    private Cell[][] cells;

    private final int COLUMN = 3;
    private final int ROW = 3;
    private final int MIN_RANDOM_NUM = 1;
    private final int MAX_RANDOM_NUM = 5;

    public GameModel() {

        setGoalNum(ROW * COLUMN * MIN_RANDOM_NUM, ROW * COLUMN * MAX_RANDOM_NUM / 2);
        createCells();

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

    public Cell[][] getCells() {
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
        if (cells[r][c].getCellStatus() == false) {
            this.sum += cells[r][c].getNumOfApple();
        }
    }

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

}
