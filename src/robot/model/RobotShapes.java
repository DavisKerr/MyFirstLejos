package robot.model;

import robot.controller.RobotController;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class RobotShapes 
{
	private RobotController baseController;
	private Motor drive;
	
	public RobotShapes(RobotController baseController)
	{
		this.baseController = baseController;
	}
	
	public void drawShape(int length, int totalSides, int angle)
	{
		int sidesDrawn = 0;
		System.out.println("Push the button to drive me.");
		Button.waitForAnyPress();
		
		while(sidesDrawn < totalSides)
		{
			double delayDegree = (90.0 / 450.0);
			int delayPerAngle = (int) Math.round(angle / delayDegree);
			drive.B.forward();
			drive.C.forward();
			Delay.msDelay(length);
			drive.B.forward();
			drive.C.backward();
			Delay.msDelay(delayPerAngle);
			drive.B.stop();
			sidesDrawn++;
		}
		drive.B.stop();
		drive.C.stop();
	}

	public void drawCircle() 
	{
		
		drive.B.forward();
		drive.C.backward();
		Delay.msDelay(2000); 
	}
}
