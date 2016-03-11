package MusicPlayerSkin;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicControllerTwo extends JPanel {

	MusicPlayer mp;
	JComboBox buttonList;
	PlaySongListener playsl;
	PauseSongListener pausesl;
	NextSongListener nsl;

	public MusicControllerTwo() {
		mp = new MusicPlayer();
		playsl = new PlaySongListener();
		pausesl = new PauseSongListener();
		nsl = new NextSongListener();

		setLayout(new FlowLayout());
		setBackground(Color.decode("#000000"));

		String[] buttonControls = { "Play", "Pause", "Next Song" };
		buttonList = new JComboBox(buttonControls);
		buttonList.setVisible(true);
		add(buttonList);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonList) {
			JComboBox pseudoBox = (JComboBox) e.getSource();
			String action = (String) pseudoBox.getSelectedItem();
			switch (action) {
			case "Play":
				buttonList.addActionListener(playsl);
				break;
			case "Pause":
				buttonList.addActionListener(pausesl);
				break;
			case "Next Song":
				buttonList.addActionListener(nsl);
			}
		}
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
