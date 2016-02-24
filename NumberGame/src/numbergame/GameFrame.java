/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author junggue
 */
public class GameFrame extends JFrame {
    public GameFrame ()
	{
		super ("AppleGame");		
  	 	GamePanel theGamePanel = new GamePanel();
                add(theGamePanel,"Center");      
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (700, 700);
		setVisible(true);
	}
}
