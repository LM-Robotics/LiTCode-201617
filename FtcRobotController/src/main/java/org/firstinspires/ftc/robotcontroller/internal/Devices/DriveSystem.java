package org.firstinspires.ftc.robotcontroller.internal.Devices;// Created by Adam Sweiger on 10/22/16

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveSystem
{
    private DcMotor[] leftMotors;
    private DcMotor[] rightMotors;

    public DriveSystem(HardwareMap hardwareMap)
    {
        leftMotors = new DcMotor[2];
        leftMotors[0] = hardwareMap.dcMotor.get("frontLeftDriveMotor");
        leftMotors[1] = hardwareMap.dcMotor.get("backLeftDriveMotor");
        /*
        TODO Test differences between having setDirection and not.
        leftMotors[0].setDirection(DcMotorSimple.Direction.FORWARD);
        leftMotors[1].setDirection(DcMotorSimple.Direction.FORWARD);
        */
        rightMotors = new DcMotor[2];
        rightMotors[0] = hardwareMap.dcMotor.get("frontRightDriveMotor");
        rightMotors[1] = hardwareMap.dcMotor.get("backRightDriveMotor");
        /*
        TODO Test differences between having setDirection and not.
        rightMotors[0].setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotors[1].setDirection(DcMotorSimple.Direction.FORWARD);
        */
    }

    // Sets power of the two left motors
    public synchronized void setLeft(double power)
    {
        double convertedPower = ((double)power);
        // for each motor in leftMotors
        for (DcMotor motor : leftMotors) {
            // Set the motor power to power
            motor.setPower(convertedPower);
        }
    }

    // Sets power of the two right motors
    public synchronized void setRight(double power)
    {
        double convertedPower = ((double)power);
        // for each motor in RightMotors
        for (DcMotor motor : rightMotors) {
            // Set the motor power to power
            motor.setPower(convertedPower);
        }
    }
    public synchronized void setPower(double leftPower, double rightPower)
    {
        setLeft(leftPower);
        setRight(rightPower);
    }
}