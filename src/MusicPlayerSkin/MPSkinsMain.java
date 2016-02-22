package MusicPlayerSkin;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MPSkinsMain {

	//FlowPanel fp = new FlowPanel();

	public static void main(String[] args) {

		JFrame frame = new JFrame("Zach's Music Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTabbedPane tp = new JTabbedPane();
		
		tp.addTab("Border", new PlayerLayout());

		frame.getContentPane().add(tp);
		

		// JPanel panel = new JPanel();
		 frame.pack();
		 frame.setVisible(true);
		
//		 JButton button = new JButton();
//		 button.setBounds(200, 200, 150, 150);
//		 button.setVisible(true);
//		 //button.paintImmediately(200, 200, 150, 150);
//		
		 //frame.add(panel);
		

	}

}
