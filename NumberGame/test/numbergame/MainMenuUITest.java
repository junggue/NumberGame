/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.event.ActionEvent;
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
public class MainMenuUITest {
    
    public MainMenuUITest() {
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
     * Test of initCustomComponents method, of class MainMenuUI.
     */
    @Test
    public void testInitCustomComponents() {
        System.out.println("initCustomComponents");
        MainMenuUI instance = new MainMenuUI();
        instance.initCustomComponents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startButtonActionPerformed method, of class MainMenuUI.
     */
    @Test
    public void testStartButtonActionPerformed() {
        System.out.println("startButtonActionPerformed");
        ActionEvent e = null;
        MainMenuUI instance = new MainMenuUI();
        instance.startButtonActionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
