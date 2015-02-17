package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousTest extends CommandGroup{
	
	public AutonomousTest(){
		addSequential(new AutonomousDrive(-0.5, 0, 1));
	}
}
