package MusicPlayerSkin;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

//clip.stop allows for a pausable function
//clip.close allows for a complete stop of music
//look up audiosystem

public class SoundFileReader extends JFrame {

	public SoundFileReader() {
		try {
			// Open an audio input stream.
			URL url = this.getClass().getResource("/MusicPlayerSkin/test.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			// Get a sound clip resource.
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
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
