package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.DriveJoystick;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	public RobotDrive myRobot = new RobotDrive(new Talon(RobotMap.leftMotor), 
											   new Talon(RobotMap.leftBackMotor), 
											   new Talon(RobotMap.rightMotor), 
											   new Talon(RobotMap.rightBackMotor));
	
	public Encoder leftEncoder = new Encoder(RobotMap.leftEncoderA,
											  RobotMap.leftEncoderB);
	
	public Encoder rightEncoder = new Encoder(RobotMap.rightEncoderA,
											  RobotMap.rightEncoderB);
	
	public DriveTrain() {
	}
	
	public Encoder getLeftEncoder(){
		return leftEncoder;
	}
	
	public Encoder getRightEncoder(){
		return rightEncoder;
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new DriveJoystick());
	}
}