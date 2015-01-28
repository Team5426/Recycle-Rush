
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
		//Robot.driveTrain.myRobot.tankDrive(OI.leftAxisY(), OI.leftAxisX());
		double y = OI.leftAxisY();
		double x = OI.leftAxisX();
		
		if (y > 0)
			y = Math.pow(y, 2);
		else
			y = -1 * Math.pow(y, 2);
		
		if (x > 0)
			x *= x;
		else
			x *= -1 * x;
		
		System.out.printf("New Axis X %f :: New Axis Y %f%n", x, y);
		SmartDashboard.putNumber("X Squared", x);
		SmartDashboard.putNumber("Y Squared", y);
		driveTrain.myRobot.arcadeDrive(y, x);
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
