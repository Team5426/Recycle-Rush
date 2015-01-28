
package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Drives with the joystick
 */
public class DriveJoystick extends CommandBase {

    public DriveJoystick() {
        // Use requires() here to declare subsystem dependencies
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		double y = OI.squareInput(OI.leftAxisY());
		double x = OI.squareInput(OI.leftAxisX());
		
		SmartDashboard.putNumber("X Squared", x);
		SmartDashboard.putNumber("Y Squared", y);
		//driveTrain.myRobot.arcadeDrive(y, x);
		driveTrain.myRobot.arcadeDrive(OI.leftAxisY(), OI.leftAxisX(), true);
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
