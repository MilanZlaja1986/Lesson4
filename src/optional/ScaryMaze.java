package optional;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.Robot;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 600;
	final int frameHeight = 400;

	ScaryMaze() throws Exception {
		
		maze = ImageIO.read(getClass().getResource("maze.png"));
		
		 new Robot().mouseMove(119, 352);
		
		
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		
		System.out.println(mouseColor);

		
		int backgroundColor = maze.getRGB(119, 370);
		
				
		if (mouseColor == backgroundColor ) {
			scare();	
		}
		
		int endColor = maze.getRGB(119, 40);
		
		if (mouseColor == endColor) {
			JOptionPane.showMessageDialog(null, "Excelent, you get out from maze!");
		}
		
		
		
	}

	private void scare() {
		System.out.println("They all float!");
		//7. find a scary sound and put it in the day5 package where you put your maze picture. You can find a sound on freesound.org. Log in as leagueofamazing/code4life.
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("pennywise.wav"));
		sound.play();
		showScaryImage("scaryImage.png");
		
		//8. play the scary sound. Hint: type "sound" and then a period.		
		
		//9. drop an image into your day5 package, and use the showScaryImage method to scare your victim!

	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("June's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



