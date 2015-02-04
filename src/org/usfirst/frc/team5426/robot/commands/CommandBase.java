package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;
import org.usfirst.frc.team5426.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5426.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team5426.robot.subsystems.Lift;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public abstract class CommandBase extends Command{

	public static ExampleSubsystem exampleSubsystem;
	public static DriveTrain driveTrain;
	public static Lift lift;
	public static OI oi;

	public static void init(){
		driveTrain = new DriveTrain();
		exampleSubsystem = new ExampleSubsystem();
		lift = new Lift();
		oi = new OI();

        SmartDashboard.putData("DriveTrain: ", driveTrain);
	}
	
	public CommandBase(String name){
		super(name);
	}
	
	public CommandBase(){
		super();
	}
}
