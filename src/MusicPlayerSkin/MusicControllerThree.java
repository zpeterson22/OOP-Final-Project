package MusicPlayerSkin;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MusicControllerThree extends JPanel {

	MusicPlayer mp;

	public MusicControllerThree() {
		mp = new MusicPlayer();

		setLayout(new FlowLayout());
		setBackground(Color.decode("#000000"));

		JButton b1 = new JButton(" Play ");
		b1.addMouseListener(new PlaySongListener());

		JButton b2 = new JButton(" Pause ");
		b2.addMouseListener(new PauseSongListener());

		JButton b3 = new JButton(" Next Song ");
		b3.addMouseListener(new NextSongListener());

		add(b1);
		add(b2);
		add(b3);

	}

	private class PlaySongListener implements MouseListener {
		@Override
		public void mouseEntered(MouseEvent arg0) {
			mp.playMusic();
		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

	}

	private class PauseSongListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {

			mp.pauseMusic();
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

	}

	private class NextSongListener implements MouseListener {

		PlaySongListener psl = new PlaySongListener();

		@Override
		public void mouseEntered(MouseEvent e) {
			mp.nextSong();
			psl.mouseEntered(e);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

}
