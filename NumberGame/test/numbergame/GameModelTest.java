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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRandomNum method, of class GameModel.
     */
    @Test
    public void testGetRandomNum() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 0;
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getRandomNum(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of chooseOption method, of class GameModel.
     */
    @Test
    public void testChooseOption() {
        System.out.println("chooseOption");
        GameModel instance = new GameModel();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

//    /**
//     * Test of sumSelectedNum method, of class GameModel.
//     */
//    @Test
//    public void testSumSelectedNum() {
//        System.out.println("sumOptionsSelected");
//        int numChosen = 0;
//        GameModel instance = new GameModel();
//        instance.sumSelectedNum(numChosen);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of play method, of class GameModel.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        GameModel instance = new GameModel();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameMatrix method, of class GameModel.
     */
    @Test
    public void testGetGameMatrix() {
        System.out.println("getGameMatrix");
        GameModel instance = new GameModel();
        int[][] expResult = null;
        int[][] result = instance.getGameMatrix();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGoalNum method, of class GameModel.
     */
    @Test
    public void testGetGoalNum() {
        System.out.println("getGoalNum");
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getGoalNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGoalNum method, of class GameModel.
     */
    @Test
    public void testSetGoalNum() {
        System.out.println("setGoalNum");
        int start = 0;
        int end = 0;
        GameModel instance = new GameModel();
        instance.setGoalNum(start, end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSum method, of class GameModel.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getSum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFinishButtonClicked method, of class GameModel.
     */
    @Test
    public void testGetFinishButtonClicked() {
        System.out.println("getFinishButtonClicked");
        GameModel instance = new GameModel();
        boolean expResult = false;
        boolean result = instance.getFinishButtonClicked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFinishButtonClicked method, of class GameModel.
     */
    @Test
    public void testSetFinishButtonClicked() {
        System.out.println("setFinishButtonClicked");
        boolean newValue = false;
        GameModel instance = new GameModel();
        instance.setFinishButtonClicked(newValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finishButtonClicked method, of class GameModel.
     */
    @Test
    public void testFinishButtonClicked() {
        System.out.println("finishButtonClicked");
        GameModel instance = new GameModel();
        instance.finishButtonClicked();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkResult method, of class GameModel.
     */
    @Test
    public void testCheckResult() {
        System.out.println("checkResult");
        GameModel instance = new GameModel();
        String expResult = "";
        String result = instance.checkResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumSelectedNum method, of class GameModel.
     */
    @Test
    public void testSumSelectedNum() {
        System.out.println("sumSelectedNum");
        int r = 0;
        int c = 0;
        GameModel instance = new GameModel();
        instance.sumSelectedNum(r, c);
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
     * Test of getNumOfColumn method, of class GameModel.
     */
    @Test
    public void testGetNumOfColumn() {
        System.out.println("getNumOfColumn");
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getNumOfColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfRow method, of class GameModel.
     */
    @Test
    public void testGetNumOfRow() {
        System.out.println("getNumOfRow");
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getNumOfRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
