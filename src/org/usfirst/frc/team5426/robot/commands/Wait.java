
package org.usfirst.frc.team5426.robot.commands;

/**
 * Waits a certain ammount of time
 */
public class Wait extends CommandBase {

	private double time;
	
    public Wait(double s) {
        time = s;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		setTimeout(time);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
