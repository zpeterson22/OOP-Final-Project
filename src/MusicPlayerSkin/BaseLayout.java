package MusicPlayerSkin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

abstract class BaseLayout extends JPanel {

	Image img;
	JPanel pan1;
	JPanel pan2;
	JPanel pan3;
	JPanel pan4;
	MusicController mc;
	MusicControllerTwo mc2;
	MusicControllerThree mc3;
	

	public void layout2() {
		
	}

	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, getX(), getY(), null);
	}

}
