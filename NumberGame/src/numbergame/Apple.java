/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import static javax.swing.SwingUtilities.paintComponent;
import static javax.swing.SwingUtilities.paintComponent;

/**
 *
 * @author laurenritter
 */
public class Apple{
//    private Circle apple = null;
    private final double diameter;
    private final Color appleColor;
    
    Apple(){
//        apple = new Circle();
        appleColor = Color.red;
        diameter = 10;
    }
    
    public void paintComponent(Graphics g){
        g.setColor(appleColor);
        Graphics2D g2d = (Graphics2D)g;
        Ellipse2D.Double apple = new Ellipse2D.Double(10, 10, diameter, diameter);
        g2d.fill(apple);
    }
}
