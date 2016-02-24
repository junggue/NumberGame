/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import static javax.swing.SwingUtilities.paintComponent;
import static javax.swing.SwingUtilities.paintComponent;

/**
 *
 * @author Warlock
 */
public class Box extends Rectangle {
    private int area;
    private Color boxColor;
    
    Box(int area) {
        this.boxColor = Color.BLUE;
        this.area = area;
    }

    public void paintComponent(Graphics r, int x, int y) {
        r.setColor(boxColor);
        Graphics2D r2d = (Graphics2D) r;
        Rectangle2D.Double box = new Rectangle2D.Double(x, y, area, area);
        r2d.fill(box);
        r2d.draw(box);

    }
    
}
