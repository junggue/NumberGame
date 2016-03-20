/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

/**
 *
 * @author junggue
 */
//Created new class to make the game model simpler
//before I had to make two of 2d-arrays: one for bollean and another one for storing random numbers
//a Cell object can store both boolean value and random number
//Now, GameModel's constructor looks a lot cleaner than before
//Uses the extract class
//Refactored by Junggue Yang
class Cell {

    private boolean selected;
    private int numOfApple;

    public Cell(int number) {
        this.selected = false;
        this.numOfApple = number;
    }

    public void setNumOfApple(int number) {
        this.numOfApple = number;
    }

    public int getNumOfApple() {
        return this.numOfApple;
    }

    public boolean getCellStatus() {
        return this.selected;
    }

    public void cellSelected() {
        this.selected = true;
    }
    
}
