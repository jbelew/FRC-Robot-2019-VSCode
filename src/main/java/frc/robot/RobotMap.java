/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//PWM
	public static final int LEFT_DRIVE_MOTOR = 10;
	public static final int RIGHT_DRIVE_MOTOR = 4;
	public static final int LEFT_DRIVE_FOLLOW_MOTOR = 8;
	public static final int RIGHT_DRIVE_FOLLOW_MOTOR = 7;
	public static final int RIGHT_ARM_MOTOR = 5;
	public static final int LEFT_ARM_MOTOR = 1;
	public static final int CARGO_MOTOR = 6;
	public static final int CLIMBER_MOTOR = 9;

}
