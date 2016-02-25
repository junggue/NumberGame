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
public class GameControllerTest {
    
    public GameControllerTest() {
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
     * Test of getRandomNum method, of class GameController.
     */
    @Test
    public void testGetRandomNum() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 0;
        GameController instance = new GameController();
        int expResult = 0;
        int result = instance.getRandomNum(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of chooseOption method, of class GameController.
     */
    @Test
    public void testChooseOption() {
        System.out.println("chooseOption");
        GameController instance = new GameController();
        instance.chooseOption();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMatrix method, of class GameController.
     */
    @Test
    public void testPrintMatrix() {
        System.out.println("printMatrix");
        GameController instance = new GameController();
        instance.printMatrix();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumOptionsSelected method, of class GameController.
     */
    @Test
    public void testSumOptionsSelected() {
        System.out.println("sumOptionsSelected");
        int numChosen = 0;
        GameController instance = new GameController();
        instance.sumOptionsSelected(numChosen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
