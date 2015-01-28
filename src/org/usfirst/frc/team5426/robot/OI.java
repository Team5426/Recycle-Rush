package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5426.robot.commands.DriveBackwards;
import org.usfirst.frc.team5426.robot.commands.DriveForwards;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick stick = new Joystick(0);
    Button buttonA = new JoystickButton(stick, 1);
    Button buttonB = new JoystickButton(stick, 2);
    Button buttonY = new JoystickButton(stick, 4);

    
    public OI(){
    	buttonY.whileHeld(new DriveForwards());
    	buttonA.whileHeld(new DriveBackwards());
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
      
}