package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HatchPanelIntake extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Compressor compressor = new Compressor();
    private DoubleSolenoid piston;

    public HatchPanelIntake() {
        super();
        piston = new DoubleSolenoid(0, 1);
        piston.set(DoubleSolenoid.Value.kForward);
    }

    public void out() {
        piston.set(DoubleSolenoid.Value.kForward);
    }

    public void in() {
        piston.set(DoubleSolenoid.Value.kReverse);
    }

    public boolean hasHatch() {
        boolean check = false;
        if(piston.get() == Value.kForward) {
            check = true;
        } else if(piston.get() == Value.kReverse) {
            check = false; 
        } else {
            check = false;
        }
        return check;
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}