/*
Author: Alden Tilley
https://github.com/eatAWESOME
Date: 3/10/2021
*/

package mouseMover;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.MouseInfo;

public class Main {
	private static Robot robot;
	public static void main(String[] args) {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		int csvstopper = 0;
		
		int i;
		for (i = 0; i < 1440; i++) {
			
			robot.mouseMove(480 , 270);
			robot.delay(1000);
			robot.mouseMove(960 , 270);
			robot.delay(1000);
			robot.mouseMove(1440 , 270);
			robot.delay(1000);
			robot.mouseMove(1440 , 540);
			robot.delay(1000);
			robot.mouseMove(1440 , 810);
			robot.delay(1000);
			robot.mouseMove(960 , 810);
			robot.delay(1000);
			robot.mouseMove(480 , 810);
			robot.delay(1000);
			robot.mouseMove(480 , 540);
			robot.delay(1000);
			robot.mouseMove(480 , 270);
			robot.delay(1000);
			robot.mouseMove(960 , 540);
			robot.delay(1000);
			
			robot.delay(50000);
			
			csvstopper = (int) MouseInfo.getPointerInfo().getLocation().getX();
			
			if(csvstopper != 960) {
				break;
			}
					
		}
	
		robot.mouseMove(480 , 270);
		robot.delay(50);
		robot.mouseMove(960 , 270);
		robot.delay(50);
		robot.mouseMove(1440 , 270);
		robot.delay(50);
		robot.mouseMove(1440 , 540);
		robot.delay(50);
		robot.mouseMove(1440 , 810);
		robot.delay(50);
		robot.mouseMove(960 , 810);
		robot.delay(50);
		robot.mouseMove(480 , 810);
		robot.delay(50);
		robot.mouseMove(480 , 540);
		robot.delay(50);
		robot.mouseMove(480 , 270);
		robot.delay(50);
		robot.mouseMove(960 , 540);
		
	}
		
}
