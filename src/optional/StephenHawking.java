package optional;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	
	public static void main(String[] args) {
		
		boolean on = true;
		
		while (on) {
			String userSentance = JOptionPane.showInputDialog("Enter your sentance please:");
			speak(userSentance);
			
			if (userSentance.equals(null)) {
				System.exit(0);
			}
		}
	}


	
	/* Don’t change this…. */
	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
