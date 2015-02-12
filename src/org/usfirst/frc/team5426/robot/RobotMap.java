package org.usfirst.frc.team5426.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around. test
 */
public class RobotMap {
    //DRIVETRAIN MOTORS
	//PWM
    public static final int leftMotor = 0;
    public static final int leftBackMotor = 1;
    public static final int rightMotor = 2;
    public static final int rightBackMotor = 3;
    
    //LIFT MOTORS
    //CAN
    public static final int liftMotor1 = 1;
    public static final int liftMotor2 = 2;
    public static final int liftArmMotor = 3;
    
    //ENCODERS
    //DIO
    public static final int leftEncoderA = 0;
    public static final int leftEncoderB = 1;

}
