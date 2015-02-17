package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousStraight extends CommandGroup{
	
	public AutonomousStraight(){
		addSequential(new AutonomousDrive(0.5, 0, 1));
	}
}
