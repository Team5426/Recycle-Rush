
package org.usfirst.frc.team5426.robot.commands;

/**
 * Drives completely backwards
 */
public class DriveBackwards extends CommandBase {

    public DriveBackwards() {
        // Use requires() here to declare subsystem dependencies
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		driveTrain.myRobot.arcadeDrive(-1, 0);
     }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
