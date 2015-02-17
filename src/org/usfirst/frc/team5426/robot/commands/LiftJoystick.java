
package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Drives with the joystick
 */
public class LiftJoystick extends CommandBase {

	public double speed;
    public LiftJoystick(double d) {
        // Use requires() here to declare subsystem dependencies
        requires(lift);
        //speed = d;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		
    	double y = -1 * OI.squareInput(OI.rightAxisY());
		double x = OI.squareInput(OI.rightAxisX());

		SmartDashboard.putNumber("Lift Squared", y);
    	SmartDashboard.putNumber("Arm Speed", x);
    	SmartDashboard.putBoolean("Bottom Limit Switch", lift.getBottomSwitch().get());
    	SmartDashboard.putBoolean("Top Limit Switch", lift.getTopSwitch().get());
    	SmartDashboard.putBoolean("Side Limit Switch", lift.getSideSwitch().get());
    	
    	//lift.myArm.set(speed);
		
    	if (((lift.getBottomSwitch().get()) && (y < 0)) || ((lift.getTopSwitch().get()) && (y > 0)))
    		y = 0;
    	
    	if ((lift.getSideSwitch().get()) && (x > 0))
    		x = 0;
    	
		lift.myArm.set(y);
		lift.myArm2.set(y);
		lift.fork.set(x);
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
