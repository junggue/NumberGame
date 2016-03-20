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
class Cell {

    private boolean selected;
    private int numOfApple;

    public Cell(int number) {
        this.selected = false;
        this.numOfApple = number;
    }
    
    public void setNumOfApple(int number){
        this.numOfApple = number;
    }
    
    public int getNumOfApple(){
        return this.numOfApple;
    }
    
    public boolean getCellStatus(){
        return this.selected;
    }

    public void cellSelected() {
        this.selected = true;
    }
}
