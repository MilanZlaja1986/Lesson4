package optional;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	Robot r200 = new Robot();
	

	void go() {
		r200.setSpeed(15);
		r200.setPenWidth(5);

		for (int i = 0; i < 4; i++) {
			r200.setRandomPenColor();
			drawSquare();
			r200.turn(90);
		}
	}
	
	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		
		r200.penDown();
		
		for (int i = 0; i < 4; i++) {
			r200.move(100);
			r200.turn(90);
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
