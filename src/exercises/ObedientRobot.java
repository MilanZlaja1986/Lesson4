package exercises;


import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	Robot r2d2 = new Robot();
	
	void r2d2Settings () {
		
		r2d2.penDown();
		r2d2.setSpeed(100);
		r2d2.setRandomPenColor();
		r2d2.setPenWidth(5);
		r2d2.setPos(new Random().nextInt(600) + 200, new Random().nextInt(400) + 100);
	}
	
	void drawCircle() {
		
		r2d2Settings ();
		
		for(int i = 0; i < 360; i++){
			r2d2.move(1);
			r2d2.turn(1);
		}
		
		r2d2.hide();
	}
	
	void drawSquare() {
		
		r2d2Settings ();
		
		for(int i = 0; i < 4; i++){
			r2d2.move(90);
			r2d2.turn(90);
			}
		r2d2.hide();
	}
	
	void drawTriangle() {
		
		r2d2Settings ();
		
		for(int i = 0; i < 3; i++){
			r2d2.move(90);
			r2d2.turn(120);
			}
		r2d2.hide();
	}
	
	public static void main(String[] args)   {
		
		int repeat;
		
		do {
			int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
			
			if (shape == 2) {
				new ObedientRobot().drawTriangle();
			}
			else if (shape == 1) {
				new ObedientRobot().drawSquare();
			}
			else if (shape == 0) {
				new ObedientRobot().drawCircle();
			}
			repeat = JOptionPane.showConfirmDialog(null, "Do you want to draw more?");
			
		} while (repeat == 0);
	}
}
