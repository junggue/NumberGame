/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junggue
 */
public class CellTest {

    // TDD practice 1
    // Cell object
    // if Cell is selected, then change 'false' to 'true'
    @Test
    public void testGetCellStatusWhenNotSelectedYet(){
        //Cell objects have two attributes
        //1. boolean selected = false;
        //2. int number
        Cell testCell = new Cell(4);
        assertEquals(false, testCell.getCellStatus());
        
    }
    
    //TDD practice 2
    // Cell object
    // if the cell is already selected, the status stays as 'true'
    @Test
    public void testGetCellStatusWhenSelectedAlready(){
        Cell testCell = new Cell(4);
        testCell.cellSelected();
        assertEquals(true, testCell.getCellStatus());
    
    }
    
}
