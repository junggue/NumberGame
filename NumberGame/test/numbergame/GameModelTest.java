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
     * Test of errorMessage method, of class GameModel.
     */
    @Test
    public void testErrorMessage() {
        System.out.println("errorMessage");
        GameModel instance = new GameModel();
        String expResult = "That number is already chosen";
        String result = instance.errorMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRandomNum method, of class GameModel.
     */
    @Test
    public void testGetRandomNumWhenNumIs9() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 9;
        int expResult = 9;
        int result = GameModel.getRandomNum(start, end);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getRandomNum method, of class GameModel.
     */
    @Test
    public void testGetRandomNumWhenNumIs3() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 3;
        int expResult = 3;
        int result = GameModel.getRandomNum(start, end);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getRandomNum method, of class GameModel.
     */
    @Test
    public void testGetRandomNumis4() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 4;
        int expResult = 4;
        int result = GameModel.getRandomNum(start, end);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getRandomNum method, of class GameModel.
     */
    @Test
    public void testGetRandomNumis5() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 5;
        int expResult = 5;
        int result = GameModel.getRandomNum(start, end);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getRandomNum method, of class GameModel.
     */
    @Test
    public void testGetRandomNumIs10() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 10;
        int expResult = 10;
        int result = GameModel.getRandomNum(start, end);
        assertEquals(expResult, result);
    }
}
