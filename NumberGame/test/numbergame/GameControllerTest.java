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
     * Test of drawPanel method, of class GameController.
     */
    @Test
    public void testDrawPanel() {
        System.out.println("drawPanel");
        GameController instance = new GameController();
        instance.drawPanel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePanel method, of class GameController.
     */
    @Test
    public void testDeletePanel() {
        System.out.println("deletePanel");
        GameController instance = new GameController();
        instance.deletePanel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawApples method, of class GameController.
     */
    @Test
    public void testDrawApples() {
        System.out.println("drawApples");
        GameController instance = new GameController();
        instance.drawApples();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    
}
