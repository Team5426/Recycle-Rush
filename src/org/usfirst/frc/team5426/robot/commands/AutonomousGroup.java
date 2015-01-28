package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousGroup extends CommandGroup{
	
	public AutonomousGroup(){
		addSequential(new AutonomousDrive(0.5, 0, 1));
	}
}
