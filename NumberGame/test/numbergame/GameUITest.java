/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Graphics;
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
public class GameUITest {
    
    public GameUITest() {
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
     * Test of initComponents method, of class GameUI.
     */
    @Test
    public void testInitComponents() {
        System.out.println("initComponents");
        GameUI instance = new GameUI();
        instance.initComponents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class GameUI.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        GameUI instance = new GameUI();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
