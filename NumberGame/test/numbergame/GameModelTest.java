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
 * @author laurenritter
 */
public class GameModelTest {
    
    public GameModelTest() {
    }

    /**
     * Test of statusResult method, of class GameModel.
     */
    @Test
    public void testStatusResultWhenPlayerWins() {
        System.out.println("statusResult");
        GameModel instance = new GameModel();
        String expResult = "You Won!";
        String result = instance.statusResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of statusRestart method, of class GameModel.
     */
    @Test
    public void testStatusRestartWhenYouLost() {
        System.out.println("statusRestart");
        GameModel instance = new GameModel();
        String expResult = "You lost";
        String result = instance.statusRestart();
        assertEquals(expResult, result);
    }

    /**
     * Test of printMatrix method, of class GameModel.
     */
    @Test
    public void testPrintMatrix() {
        System.out.println("printMatrix");
        GameModel instance = new GameModel();
        instance.printMatrix();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getANumFromMatrix method, of class GameModel.
     */
    @Test
    public void testGetANumFromMatrix() {
        System.out.println("getANumFromMatrix");
        int r = 0;
        int c = 0;
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getANumFromMatrix(r, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numButtonPushed method, of class GameModel.
     */
    @Test
    public void testNumButtonPushed() {
        System.out.println("numButtonPushed");
        int r = 0;
        int c = 0;
        GameModel instance = new GameModel();
        instance.numButtonPushed(r, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of errorMessage method, of class GameModel.
     */
    @Test
    public void testErrorMessage() {
        System.out.println("errorMessage");
        GameModel instance = new GameModel();
        String expResult = "";
        String result = instance.errorMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandomNum method, of class GameModel.
     */
    @Test
    public void testGetRandomNum() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 0;
        int expResult = 0;
        int result = GameModel.getRandomNum(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
