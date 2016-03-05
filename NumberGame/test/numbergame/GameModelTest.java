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

//    /**
//     * Test of errorMessage method, of class GameModel.
//     */
//    @Test
//    public void testErrorMessage() {
//        System.out.println("errorMessage");
//        GameModel instance = new GameModel();
//        String expResult = "That number is already chosen";
//        String result = instance.errorMessage();
//        assertEquals(expResult, result);
//    }
    
    @Test
    public void testGetRandomNumisRandom1() {
        System.out.println("getRandomNum");
        int start = 1;
        int end = 1;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = GameModel.getRandomNum(start, end);
            
            if(start <= randomNum && randomNum <=end){
               
            }else{
                fail("failed");
            }
        }
    }
    @Test
    public void testGetRandomNumisRandom2() {
        System.out.println("getRandomNum");
        int start = 2;
        int end = 2;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = GameModel.getRandomNum(start, end);
            
            if(start <= randomNum && randomNum <=end){
               
            }else{
                fail("failed");
            }
        }
    }


    @Test
    public void testGetRandomNumisRandom0() {
        System.out.println("getRandomNum");
        int start = 0;
        int end = 0;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = GameModel.getRandomNum(start, end);
            
            if(start <= randomNum && randomNum <=end){
               
            }else{
                fail("failed");
            }
        }
    }

    @Test
    public void testGetRandomNumisRandom1to5() {
        System.out.println("getRandomNum");
        int start = 1;
        int end = 5;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = GameModel.getRandomNum(start, end);
            
            if(start <= randomNum && randomNum <=end){
               
            }else{
                fail("failed");
            }
        }
    }
    
    @Test
    public void testGetRandomNumisRandom1to4() {
        System.out.println("getRandomNum");
        int start = 1;
        int end = 4;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = GameModel.getRandomNum(start, end);
            
            if(start <= randomNum && randomNum <=end){
               
            }else{
                fail("failed");
            }
        }
    }
    
    @Test
    public void testGetRandomNumisRandom1to3() {
        System.out.println("getRandomNum");
        int start = 1;
        int end = 3;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = GameModel.getRandomNum(start, end);
            
            if(start <= randomNum && randomNum <=end){
               
            }else{
                fail("failed");
            }
        }
    }
    
    @Test
    public void testGetRandomNumisRandom1to2() {
        System.out.println("getRandomNum");
        int start = 1;
        int end = 2;
        int randomNum;
        int result;

        for (int i = 0; i < 1000000; i++) {

            randomNum = GameModel.getRandomNum(start, end);
            
            if(start <= randomNum && randomNum <=end){
               
            }else{
                fail("failed");
            }
        }
    }


}
