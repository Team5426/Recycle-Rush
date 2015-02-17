package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.LiftJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift extends Subsystem{

	public CANTalon myArm = new CANTalon(RobotMap.liftMotor1);
	public CANTalon myArm2 = new CANTalon(RobotMap.liftMotor2);
	public CANTalon fork = new CANTalon(RobotMap.liftArmMotor);
	
	private DigitalInput bottomSwitch = new DigitalInput(RobotMap.bottomSwitchDIO);
	private DigitalInput topSwitch = new DigitalInput(RobotMap.topSwitchDIO);
	private DigitalInput sideSwitch = new DigitalInput(RobotMap.sideSwitchDIO);
	
	public Lift(){
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new LiftJoystick(0));
	}
	
	public DigitalInput getBottomSwitch(){
		return bottomSwitch;
	}
	
	public DigitalInput getTopSwitch(){
		return topSwitch;
	}
	
	public DigitalInput getSideSwitch(){
		return sideSwitch;
	}
}
