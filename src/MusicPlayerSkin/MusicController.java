package MusicPlayerSkin;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MusicController extends JPanel{

	public MusicController(){
		
		setLayout(new FlowLayout());
		setBackground(Color.decode("#000000"));
		
		JButton b1 = new JButton(" << Last Song ");
		JButton b2 = new JButton(" Play/Pause ");
		JButton b3 = new JButton(" Next Song >> ");
		
		add(b1);
		add(b2);
		add(b3);

		
	}
	
}
