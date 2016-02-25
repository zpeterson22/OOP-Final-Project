package MusicPlayerSkin;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MusicController extends JPanel {

	Clip clip;
	
	public MusicController() {

		setLayout(new FlowLayout());
		setBackground(Color.decode("#000000"));

		JButton b1 = new JButton(" Start ");
		b1.addActionListener(new StartSongListener());

		JButton b2 = new JButton(" Play ");
		b2.addActionListener(new PlaySongListener());

		JButton b3 = new JButton(" Pause/Unpause ");
		b3.addActionListener(new PauseSongListener());

		add(b1);
		add(b2);
		add(b3);
	}

	private class StartSongListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				URL url = this.getClass().getResource("/MusicPlayerSkin/test.wav");
				AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			} catch (UnsupportedAudioFileException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (LineUnavailableException e) {
				e.printStackTrace();
			}
		}

	}
	
	private class PlaySongListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			clip.start();
		}
	}

	private class PauseSongListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			clip.stop();
		}

	}

}
