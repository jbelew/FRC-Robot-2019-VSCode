/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.CargoSpinIn;
import frc.robot.commands.CargoSpinOut;
import frc.robot.commands.PistonIn;
import frc.robot.commands.PistonOut;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //public XboxController controller = new XboxController(0);
    JoystickButton pistonOut;
    JoystickButton pistonIn;
    JoystickButton cargoIn;
    JoystickButton cargoOut;
    // Setting squaredInput to true decreases the sensitivity for tankdrive at lower speeds
	private boolean squaredInput = true;
	
	public Joystick leftStick = new Joystick(2);
	public Joystick rightStick = new Joystick(3);


    public OI() {
        pistonOut = new JoystickButton(leftStick, 2);
        pistonOut.whenPressed(new PistonOut());
        pistonIn = new JoystickButton(leftStick, 3);
        pistonIn.whenPressed(new PistonIn());
        cargoIn = new JoystickButton(leftStick,1);
        cargoIn.whileHeld(new CargoSpinIn());
        cargoOut = new JoystickButton(rightStick,1);
        cargoOut.whileHeld(new CargoSpinOut());
	}
	
	public Joystick getLeftStick() {
		return leftStick;
	}

	public Joystick getRightStick() {
		return rightStick;
	}


    // public XboxControlle.Thumbsstick getLeftStick() {
    //     return controller.leftStick;
    // }

    // public XboxController.Thumbstick getRightStick() {
    //     return controller.rightStick;
    // }

    public boolean getSquaredInput() {
        return squaredInput;
    }
}

