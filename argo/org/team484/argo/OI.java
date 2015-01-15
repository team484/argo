
package org.team484.argo;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
   
	//Initialize two joysticks
	Joystick driveStickLeft = new Joystick(RobotMap.driveStickLeft);
    Joystick shootStickRight = new Joystick(RobotMap.shootStickRight);
    
    //Accessors for left joystick posisition
    //================================================
    public double getDriveXLeft() {
        return driveStickLeft.getX();
    }
    public double getDriveZLeft() {
        return driveStickLeft.getZ();
    }
    public double getDriveYLeft() {
        return driveStickLeft.getY();
    }
    public boolean getDriveTriggerLeft() {
        return driveStickLeft.getTrigger();
    }
    //================================================
    
    //Accessors for right joystick position
    //================================================
    public double getDriveXRight() {
        return shootStickRight.getX();
    }
    public double getDriveZRight() {
        return shootStickRight.getZ();
    }
    public double getDriveYRight() {
        return shootStickRight.getY();
    }
    public boolean getDriveTriggerRight() {
        return shootStickRight.getTrigger();
    }
    //================================================
}

