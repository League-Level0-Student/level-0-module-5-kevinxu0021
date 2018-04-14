import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		// 1. Create a robot
		Robot r2d2 = new Robot();
		// 2. Set the speed to 100
r2d2.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "Pick a color.", "Colors", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Blue", "Green", "Red" }, 0);

		// 3. Set the pen color of the robot according to the value of the colorChoice
		// variable
		r2d2.penDown();
		if(colorChoice == 2) {
			r2d2.setPenColor(255,0,0);
		}else if(colorChoice == 1) {
			r2d2.setPenColor(0, 255, 0);
		}else if(colorChoice == 0) {
			r2d2.setPenColor(0,0,255);
		}
		// 4. Ask the use how many polygons they want to be drawn.
String input = JOptionPane.showInputDialog("How many polygons do you want the robot to draw?");
int polygons = Integer.parseInt(input);
		// 5. Use the robot to draw the number of polygons the user requested.

for (int i = 0; i < polygons; i++) {
	for (int j = 0; j < 5; j++) {
		r2d2.move(100);
		r2d2.turn(72);
	}
	r2d2.penUp();
r2d2.turn(90);	
r2d2.move(300);
r2d2.penDown();
}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
