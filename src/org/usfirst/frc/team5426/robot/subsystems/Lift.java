package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.LiftJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift extends Subsystem{

	public CANTalon myArm = new CANTalon(RobotMap.liftMotor1);
	public CANTalon myArm2 = new CANTalon(RobotMap.liftMotor2);
	
	public Lift(){
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new LiftJoystick(0));
	}
}
