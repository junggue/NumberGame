/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

/**
 *
 * @author tianyue
 */
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.RenderingHints;

public class ImgUtils {

public BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename) {
    BufferedImage bi = null;
    try {
        ImageIcon ii = new ImageIcon(filename);//path to image
        bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(ii.getImage(), 0, 0, WIDTH, HEIGHT, null);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
    return bi;
}

 }
