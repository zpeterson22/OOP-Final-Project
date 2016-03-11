package MusicPlayerSkin;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class LayoutDecision {

	LayoutChoices lc;
	
	public void decision(){
		JFrame frame = new JFrame("Zach's Music Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tp = new JTabbedPane();
		
		switch(lc){
		case RED:
			tp.addTab("Music Player 1", new LayoutThree());
			break;
		
		}
		
		
		frame.getContentPane().add(tp);
		frame.pack();
		frame.setVisible(true);
	}
	
}
