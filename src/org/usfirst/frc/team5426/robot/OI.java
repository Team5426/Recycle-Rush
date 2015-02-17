package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5426.robot.commands.DriveBackwards;
import org.usfirst.frc.team5426.robot.commands.DriveForwards;
import org.usfirst.frc.team5426.robot.commands.LiftArms;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick stick = new Joystick(0);
    Button buttonA = new JoystickButton(stick, 1);
    Button buttonB = new JoystickButton(stick, 2);
    Button buttonY = new JoystickButton(stick, 4);
    Button lTrigger = new JoystickButton(stick, 5);
    Button rTrigger = new JoystickButton(stick, 6);

    public OI(){
    	double speed = 0.5;
    	buttonY.whileHeld(new DriveForwards());
    	buttonA.whileHeld(new DriveBackwards());
    	lTrigger.whileHeld(new LiftArms(-1 * speed));
    	rTrigger.whileHeld(new LiftArms(speed));
    }
    
    
    /**
     * @return Value of the left analog Y axis
     */
    public static double leftAxisY(){
    	return -stick.getRawAxis(1);
    }
    
    /**
     * @return Value of the left analog X axis
     */
    public static double leftAxisX(){
    	return -stick.getRawAxis(0);
    	//return -stick.getRawAxis(2); //Logitech
    }
    
    /**
     * @return Value of the right analog Y axis
     */
    public static double rightAxisY(){
    	return stick.getRawAxis(5);
    }
    
    
    /**
     * @return Value of the right analog X axis
     */
    public static double rightAxisX(){
    	return stick.getRawAxis(4);
    }
    
    
    /**
     * @param n The number to square
     * @return Returns n to the second power. Sign of n doesn't change
     */
    public static double squareInput(double n){
		if (n > 0)
			n = Math.pow(n, 2);
		else
			n = -1 * Math.pow(n, 2);
		
		return n;
    }
      
}