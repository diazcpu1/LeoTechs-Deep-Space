/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;


public class DriveTrain extends Subsystem {

  private Talon leftMotor = new Talon(RobotMap.LEFT_MOTOR_PORT);
  private Talon rightMotor = new Talon(RobotMap.RIGHT_MOTOR_PORT);
  private Talon rearLeft = new Talon(RobotMap.REAR_LEFT_MOTOR_PORT);
  private Talon rearRight = new Talon(RobotMap.REAR_RIGHT_MOTOR_PORT);

  public void setLeftMotors(double speed)
  {
    leftMotor.set(-speed);
    rearLeft.set(-speed);
  }

  public void setRightMotors(double speed)
  {
    rightMotor.set(speed);
    rearRight.set(speed);
  }



  @Override
  public void initDefaultCommand() {
    
    setDefaultCommand(new TankDrive());

  }
}
