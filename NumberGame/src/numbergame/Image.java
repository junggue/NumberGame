/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import javax.swing.ImageIcon;

/**
 *
 * @author laurenritter
 */
public class Image {
    
    ImageIcon img1, img2, img3, img4, img5, questionImage;
    ImageIcon image;
    
    
    //Class taken from the GameUI class. Allows for image code to all be in one place and easy to find.
    //Uses the extract class method
    //Refactored by Lauren Ritter
    Image(){
        img1 = new ImageIcon("src/images/1.png");
        img2 = new ImageIcon("src/images/2.png");
        img3 = new ImageIcon("src/images/3.png");
        img4 = new ImageIcon("src/images/4.png");
        img5 = new ImageIcon("src/images/5.png");
        questionImage = new ImageIcon("src/images/question.png");
    }
    
    // Because Image will be changed twice in a game  
    // (1. after 5 seconds after game started)
    // (2. to show the original apple image when the question button is clicked )
    // Creating this method was inevitable
    // Refactored by "Junggue Yang"
    public ImageIcon getImage(int num) {

        switch (num) {
            case 1:
                image = img1;
                break;
            case 2:
                image = img2;
                break;
            case 3:
                image = img3;
                break;
            case 4:
                image = img4;
                break;
            default:
                image = img5;
                break;
        }

        return image;
    }
    
    
}
