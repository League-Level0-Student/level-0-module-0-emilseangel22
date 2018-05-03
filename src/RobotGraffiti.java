import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	//Make a new robot
	Robot r = new Robot();
	r.setPenColor(Color.red);
	//pen down
	r.penDown();
	//move
	r.move(100);
	//set speed
	r.setSpeed(40);
	
}	
}
