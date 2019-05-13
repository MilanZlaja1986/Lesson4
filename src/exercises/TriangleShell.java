package exercises;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot r2d2 = new Robot();

	void go() {
		r2d2.setSpeed(15);

		int length = 50;
		
		for (int i = 0; i < 60; i++) {
			
			r2d2.setRandomPenColor();
			length += 10;
			drawTriangle(length);
			r2d2.turn(6);	
		}	
	}

	private void drawTriangle(int length) {
		r2d2.penDown();
		
		for (int i = 0; i < 3; i++) {
			r2d2.move(length);
			r2d2.turn(360/3);
		}	
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
