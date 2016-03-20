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
    private int number;

    public Cell(int number) {
        this.selected = false;
        this.number = number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public boolean getCellStatus(){
        return this.selected;
    }

    public void cellSelected() {
        this.selected = true;
    }
}
