package org.firstinspires.ftc.teamcode.Devices;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by Eamonn on 10/29/2016. Funtastic.
 */

public class

TrapDoorMechanic
{
    private Servo[] axelRotation = null;

    public TrapDoorMechanic(HardwareMap hardwareMap)
    {
        axelRotation = new Servo[1];
        axelRotation[0] = hardwareMap.servo.get("trapDoorMotor");

    }

    public synchronized void setPosition(double angle)
    {
        for (Servo servo : axelRotation) {
            // Set the motor power to power
            servo.setPosition(angle);
        }
    }
}

