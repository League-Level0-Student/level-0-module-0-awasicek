package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

// 1. Create a class called RobotGraffiti.

public class RobotGraffiti {
	public static void main(String[] args) throws InterruptedException {
		// note: +90 is a right turn, -90 is a left turn
		
		// 2. Use the Robot to draw the first letter of your name
		
		Robot rob = new Robot();
		rob.setX(50);
		rob.setY(300);
		rob.setSpeed(30);
		rob.penDown();
		
		// Letter "A"
		rob.turn(20);
		rob.move(100);
		rob.turn(140);
		rob.move(50);
		// draw the connection between the two sides
		rob.turn(110);
		rob.move(33);
		rob.turn(180);
		rob.move(33);
		// finish the second side
		rob.turn(70);
		rob.move(50);
		rob.hide();
		
		// 3. BONUS: Write your entire first name using the Robot
		rob.penUp();
		rob.setX(150);
		rob.penDown();
		rob.setAngle(0);
		rob.show();
		
		// Letter "N"
		rob.move(50);
		rob.turn(135);
		rob.move(72);
		rob.turn(-135);
		rob.move(50);
		rob.hide();
		
		rob.penUp();
		rob.setX(225);
		rob.setY(300);
		rob.penDown();
		rob.setAngle(0);
		rob.show();
		
		// Letter "D"
		rob.move(50);
		rob.turn(135);
		rob.move(35);
		rob.turn(90);
		rob.move(35);
		rob.hide();
		
		rob.penUp();
		rob.setX(275);
		rob.setY(300);
		rob.penDown();
		rob.setAngle(0);
		rob.show();
		
		// Letter "R"
		rob.move(50);
		rob.turn(135);
		rob.move(22);
		rob.turn(90);
		rob.move(22);
		rob.turn(-90);
		rob.move(27);
		rob.hide();
		
		rob.penUp();
		rob.setX(325);
		rob.setY(300);
		rob.penDown();
		rob.setAngle(0);
		rob.show();
		
		// Letter "E"
		rob.move(50);
		rob.turn(90);
		rob.move(20);
		rob.turn(180); // turn around
		rob.move(20);
		rob.turn(-90); // go to middle
		rob.move(25);
		rob.turn(-90);
		rob.move(20);
		rob.turn(180); // turn around
		rob.move(20);
		rob.turn(-90); // go to bottom
		rob.move(25);
		rob.turn(-90);
		rob.move(20);
		rob.hide();
		
		rob.penUp();
		rob.setX(375);
		rob.setY(300);
		rob.penDown();
		rob.setAngle(0);
		rob.show();
		
		// Letter "W"
		rob.penUp();
		rob.move(50);
		rob.penDown();
		rob.turn(160);
		rob.move(60);
		rob.turn(-140);
		rob.move(25);
		rob.turn(140);
		rob.move(25);
		rob.turn(-140);
		rob.move(60);
		
		rob.hide();
	}
}
