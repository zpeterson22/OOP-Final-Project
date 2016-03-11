package MusicPlayerSkin;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MusicController extends JPanel {

	MusicPlayer mp;

	public MusicController() {
		mp = new MusicPlayer();

		setLayout(new FlowLayout());
		setBackground(Color.decode("#000000"));

		JButton b1 = new JButton(" Play ");
		b1.addActionListener(new PlaySongListener());

		JButton b2 = new JButton(" Pause ");
		b2.addActionListener(new PauseSongListener());

		JButton b3 = new JButton(" Next Song ");
		b3.addActionListener(new NextSongListener());

		add(b1);
		add(b2);
		add(b3);

	}

	private class PlaySongListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			mp.playMusic();
		}
	}

	private class PauseSongListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			mp.pauseMusic();
		}
	}

	private class NextSongListener implements ActionListener {

		PlaySongListener psl = new PlaySongListener();

		@Override
		public void actionPerformed(ActionEvent arg0) {
			mp.nextSong();
			psl.actionPerformed(arg0);
		}
	}
}
