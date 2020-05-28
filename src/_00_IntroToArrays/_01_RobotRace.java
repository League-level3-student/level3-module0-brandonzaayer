package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
		//2. create an array of 5 robots.
		Robot[] fiveRobots = new Robot[5];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i < fiveRobots.length; i++) {
			fiveRobots[i] = new Robot("batman");
			//4. make each robot start at the bottom of the screen, side by side, facing up
			fiveRobots[i].moveTo(400+i*100, 400);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		boolean raceInprogress = true;
		while(raceInprogress == true) {
		for (int i=0; i < fiveRobots.length; i++) {
			Random r = new Random();
			fiveRobots[i].setSpeed(10);
			fiveRobots[i].move(r.nextInt(50));
			if(fiveRobots[i].getY()<=0) {
				JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " is our winner!");
				raceInprogress = false;
				break;
			}
			}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
