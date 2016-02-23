/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javafx.scene.shape.Circle;

/**
 *
 * @author laurenritter
 */
public class Apple extends Circle{
    private Circle apple = null;
    private final double radius;
    private final Color appleColor;
    
    Apple(){
        apple = new Circle();
        radius = 50.0;
        appleColor = Color.red;
    }
    
    public void draw(Graphics graph){
        graph.setColor(appleColor);
        //graph.(0, 0, this.apple, this.apple);
    }
}
