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
public class GamePanelTest {
    
    public GamePanelTest() {
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
     * Test of initComponents method, of class GamePanel.
     */
    @Test
    public void testInitComponents() {
        System.out.println("initComponents");
        GamePanel instance = new GamePanel();
        instance.initComponents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class GamePanel.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        GamePanel instance = new GamePanel();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
