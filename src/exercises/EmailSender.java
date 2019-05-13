package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class EmailSender {

	void go() {
		/*
		 * Use the methods below to send an email and print a warning if the email did
		 * not send correctly.
		 */
		
		emailAddress = JOptionPane.showInputDialog("Please enter e-mail address");
		greeting = JOptionPane.showInputDialog("Please enter your message");
		
		setEmailAddress(emailAddress);
		send(greeting);
		
		if (send(greeting) == false) {
			JOptionPane.showMessageDialog(null, "Your message delivery failed");
		} 
		else {
			JOptionPane.showMessageDialog(null, "Your message send successfully");
		}
	}

	/* Returns true if email was sent successfully, false if it failed to send. */
	boolean send(String greeting) {
		if (this.emailAddress.isBlank()) {
			System.err.println("You did not provide a recipient for the email!");
			return false;
		}
		return new Random().nextBoolean();
	}

	private String emailAddress = "";
	private String greeting = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
