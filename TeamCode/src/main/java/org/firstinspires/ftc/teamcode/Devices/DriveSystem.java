package org.firstinspires.ftc.teamcode.Devices;// Created by Adam Sweiger on 10/22/16

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

//Reason sweeperMechanic is in here is to potetnially problem solve code issues
public class DriveSystem
{
    private DcMotor[] leftMotors;
    private DcMotor[] rightMotors;
    private DcMotor sweeper;

    public DriveSystem(HardwareMap hardwareMap)
    {
        leftMotors = new DcMotor[2];
        leftMotors[0] = hardwareMap.dcMotor.get("frontLeftDriveMotor");
        leftMotors[1] = hardwareMap.dcMotor.get("backLeftDriveMotor");

        leftMotors[0].setDirection(DcMotorSimple.Direction.REVERSE);
        leftMotors[1].setDirection(DcMotorSimple.Direction.REVERSE);

        rightMotors = new DcMotor[2];
        rightMotors[0] = hardwareMap.dcMotor.get("frontRightDriveMotor");
        rightMotors[1] = hardwareMap.dcMotor.get("backRightDriveMotor");

        rightMotors[0].setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotors[1].setDirection(DcMotorSimple.Direction.FORWARD);

        //Reason sweeperMechanic is in here is to potentially problem solve code issues
       /* sweeperMotor = new DcMotor;
        sweeperMotor = hardwareMap.dcMotor.get("sweeperMotor");*/

    }

    // Sets power of the two left motors
    public synchronized void setLeft(double power)
    {
        double convertedPower = (power);
        // for each motor in leftMotors
        for (DcMotor motor : leftMotors) {
            // Set the motor power to power
            motor.setPower(convertedPower);
        }
    }

    // Sets power of the two right motors
    public synchronized void setRight(double power)
    {
        double convertedPower = (power);
        // for each motor in RightMotors
        for (DcMotor motor : rightMotors) {
            // Set the motor power to power
            motor.setPower(convertedPower);
        }
    }
    /*public static synchronized void setPower(double power)
    {

        axelRotation.setPower(power);*/
    //}

    //Reason sweeperMechanic is in here is to potetnially problem solve code issues
    public synchronized void setBoth (double leftPower, double rightPower)// double setPower)
    {
        setLeft(leftPower);
        setRight(rightPower);


    }
}