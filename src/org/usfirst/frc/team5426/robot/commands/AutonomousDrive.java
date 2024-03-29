
package org.usfirst.frc.team5426.robot.commands;

/**
 * Drives with the joystick
 */
public class AutonomousDrive extends CommandBase {

	private double moveValue, rotateValue, time;
	
	/**
	 * 
	 * @param y Forwards/Backwards speed 
	 * @param x Left/Right speed
	 * @param s Amount of time to run this command
	 */
    public AutonomousDrive(double y, double x, double s) {
        // Use requires() here to declare subsystem dependencies
        requires(driveTrain);
        moveValue = y;
        rotateValue = x;
        time = s;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		driveTrain.myRobot.arcadeDrive(moveValue, rotateValue);
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
