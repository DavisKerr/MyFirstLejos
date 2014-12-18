package robot.controller;

import javax.microedition.sensor.SensorInfo;
import javax.microedition.sensor.SensorListener;

import robot.model.RobotShapes;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;
import lejos.nxt.TouchSensor;
import lejos.util.Delay;

public class RobotController 
{
	private RobotShapes shape;
	private TouchSensor touchSensor; 
	
	public RobotController()
	{
		shape = new RobotShapes(this);
		touchSensor = new TouchSensor(SensorPort.S1);
	}
	
	

	public void start()
	{
		
		shape.drawShape(2000, 4, 85); //square
		shape.drawShape(2000, 3, 60); //triangle
		shape.drawShape(2000, 6, 50);//hexagon
		shape.drawShape(2000, 8, 25); //octagon
		shape.drawCircle();
	}
	
//	private void setupListeners() 
//	{
//		
//		touchSensor.isPressed();
//		
//	}

}
