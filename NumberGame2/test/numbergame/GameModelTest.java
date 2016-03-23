/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.util.Arrays;
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
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetRandomNumisRandom1() {
        System.out.println("getRandomNum");
        GameModel instance = new GameModel();
        int start = 1;
        int end = 1;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = instance.getRandomNum(start, end);

            if (start <= randomNum && randomNum <= end) {

            } else {
                fail("the random number is not in the range, which is " + start + "~" + end);
            }
        }
    }

    @Test
    public void testGetRandomNumisRandom2() {
        System.out.println("getRandomNum");
        GameModel instance = new GameModel();
        int start = 2;
        int end = 2;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = instance.getRandomNum(start, end);

            if (start <= randomNum && randomNum <= end) {

            } else {
                fail("failed");
            }
        }
    }

    @Test
    public void testGetRandomNumisRandom0() {
        System.out.println("getRandomNum");
        GameModel instance = new GameModel();
        int start = 0;
        int end = 0;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = instance.getRandomNum(start, end);

            if (start <= randomNum && randomNum <= end) {

            } else {
                fail("failed");
            }
        }
    }

    @Test
    public void testGetRandomNumisRandom1to5() {
        System.out.println("getRandomNum");
        GameModel instance = new GameModel();
        int start = 1;
        int end = 5;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = instance.getRandomNum(start, end);

            if (start <= randomNum && randomNum <= end) {

            } else {
                fail("failed");
            }
        }
    }

    @Test
    public void testGetRandomNumisRandom1to4() {
        System.out.println("getRandomNum");
        GameModel instance = new GameModel();
        int start = 1;
        int end = 4;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = instance.getRandomNum(start, end);

            if (start <= randomNum && randomNum <= end) {

            } else {
                fail("failed");
            }
        }
    }

    @Test
    public void testGetRandomNumisRandom1to3() {
        System.out.println("getRandomNum");
        GameModel instance = new GameModel();
        int start = 1;
        int end = 3;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = instance.getRandomNum(start, end);

            if (start <= randomNum && randomNum <= end) {

            } else {
                fail("failed");
            }
        }
    }

    @Test
    public void testGetRandomNumisRandom1to2() {
        System.out.println("getRandomNum");
        GameModel instance = new GameModel();
        int start = 1;
        int end = 2;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = instance.getRandomNum(start, end);

            if (start <= randomNum && randomNum <= end) {

            } else {
                fail("failed");
            }
        }
    }

    /**
     * Test of sumSelectedNum method, of class GameModel.
     */
    @Test
    public void testSumSelectedNum1st() {
        System.out.println("sumSelectedNum");
        GameModel instance = new GameModel();

        instance.sumSelectedNum(0, 1);
        instance.sumSelectedNum(0, 1);

        assertEquals(2 * instance.getCells()[0][1].getNumOfApple(), instance.getSum());

    }

    @Test
    public void testSumSelectedNum2st() {
        System.out.println("sumSelectedNum");
        GameModel instance = new GameModel();

        instance.sumSelectedNum(2, 2);
        instance.sumSelectedNum(2, 2);

        assertEquals(2 * instance.getCells()[2][2].getNumOfApple(), instance.getSum());

    }

    @Test
    public void testSumSelectedNum3st() {
        System.out.println("sumSelectedNum");
        GameModel instance = new GameModel();

        int sum = 2;

        int testNum1 = instance.getCells()[0][0].getNumOfApple();

        //test if the method is actually summing or not
        instance.sumSelectedNum(0, 0);

        assertEquals(sum + testNum1, 2 + instance.getSum());

    }

    /**
     * Test of numButtonPushed method, of class GameModel.
     */
    @Test
    public void testNumButtonPushedWhenPushed() {
        System.out.println("numButtonPushed");
        int r = 1;
        int c = 1;
        GameModel instance = new GameModel();
        //boolean before pushed
        System.out.println(instance.getCells()[r][c].getCellStatus());
        //button pushed
        instance.getCells()[r][c].cellSelected();
        //boolean after pushed
        System.out.println(instance.getCells()[r][c].getCellStatus());

        boolean expResult = true;
        assertEquals(expResult, instance.getCells()[r][c].getCellStatus());

    }

    @Test
    public void testNumButtonPushedWhenNotPushed() {
        System.out.println("numButtonPushed");
        int r = 1;
        int c = 1;
        GameModel instance = new GameModel();
        //boolean before pushed
        System.out.println(instance.getCells()[r][c].getCellStatus());

        boolean expResult = false;
        assertEquals(expResult, instance.getCells()[r][c].getCellStatus());

    }

    // TDD practice 
    // Step 1. create a test
    // test if a method store randomNumbers in the matrix
    @Test
    public void createCells() {

        System.out.println("Check if each cell is stored with correct random number range");

    }

}
