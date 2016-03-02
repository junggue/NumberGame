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

    /**
     * Test of switchToInstructions method, of class MainMenuUI.
     */
    @Test
    public void testSwitchToInstructions() {
        System.out.println("switchToInstructions");
        MainMenuUI instance = new MainMenuUI();
        instance.switchToInstructions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchToMainTable method, of class MainMenuUI.
     */
    @Test
    public void testSwitchToMainTable() {
        System.out.println("switchToMainTable");
        MainMenuUI instance = new MainMenuUI();
        instance.switchToMainTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exitButtonActionPerformed method, of class MainMenuUI.
     */
    @Test
    public void testExitButtonActionPerformed() {
        System.out.println("exitButtonActionPerformed");
        ActionEvent e = null;
        MainMenuUI instance = new MainMenuUI();
        instance.exitButtonActionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of instructionsButtonActionPerformed method, of class MainMenuUI.
     */
    @Test
    public void testInstructionsButtonActionPerformed() {
        System.out.println("instructionsButtonActionPerformed");
        ActionEvent e = null;
        MainMenuUI instance = new MainMenuUI();
        instance.instructionsButtonActionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
