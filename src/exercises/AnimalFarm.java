package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		
		for (int i = 0; i < 6; i++) {
			String userAnswer = JOptionPane.showInputDialog("What animal sound you will love to hear?");
			
			if (userAnswer.equals("moo")) {
				playMoo();
			} 
			else if (userAnswer.equals("quack")) {
				playQuack();
			}
			else if (userAnswer.equals("woof")) {
				playWoof();
			}
			else if (userAnswer.equals("meow")) {
				playMeow();
			}
			else if (userAnswer.equals("llama")) {
				playLlama();
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
		}

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playMeow() {
		playNoise(meowFile);
	}
	
	void playLlama() {
		playNoise(llamaFile);
	}
	
	
	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";
	

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
