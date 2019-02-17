/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;



public class OI {

  private Joystick leftStick = new Joystick(RobotMap.LEFT_STICK_PORT);
  private Joystick rightStick = new Joystick(RobotMap.RIGHT_STICK_PORT);

  public double getLeftRawAxis(int axis)
  {
      return leftStick.getRawAxis(axis);
  }

  public double getRightRawAxis(int axis)
  {
    return rightStick.getRawAxis(axis);
  }

}
