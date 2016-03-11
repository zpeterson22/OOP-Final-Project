package MusicPlayerSkin;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MPSkinsMain {

	public static void main(String[] args) {
		// MusicController mc = new MusicController();

		JFrame frame = new JFrame("Zach's Music Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tp = new JTabbedPane();
		// this is an easy fix to repeated code, does not let you chose the
		// layout, this just show each layout at the same time
		tp.addTab("Music Player 1", new LayoutOne());
//		tp.addTab("Music Player 2", new LayoutTwo());
//		tp.addTab("Music Player 3", new LayoutThree());
		frame.getContentPane().add(tp);
		frame.pack();
		frame.setVisible(true);

	}

}
