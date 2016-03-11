package MusicPlayerSkin;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.*;
import javax.swing.*;

public class MusicPlayer extends JFrame {

	private Clip clip;
	Random rand = new Random();
	ArrayList<String> songList = new ArrayList<String>();

	
	
	//this class has cohesion, it only works with playing audio
	
	
	public MusicPlayer() {
		songList.add("/MusicPlayerSkin/test.wav");
		songList.add("/MusicPlayerSkin/test2.wav");
		songList.add("/MusicPlayerSkin/test3.wav");
	}

	public void playMusic() {
		try {
			URL url = this.getClass().getResource(songList.get(rand.nextInt(3)));
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

	public void pauseMusic() {
		if (clip.isActive()) {
			clip.stop();
		} else {
			clip.start();
		}
	}

	public void nextSong() {
		
		clip.close();

	}

}
