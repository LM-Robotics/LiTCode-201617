package org.firstinspires.ftc.teamcode.Devices;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;



/**
 * Created by Eamonn on 10/29/2016. Funtastic.
 */


public class TrapDoorMechanic
{
    private Servo[] trapDoor;


    public TrapDoorMechanic(HardwareMap hardwareMap)
    {
        trapDoor = new Servo[1];
        trapDoor[0] = hardwareMap.servo.get("trapDoorServo");
    }

    public synchronized void setPosition(double angle)
    {
            // Set the motor power to power
            trapDoor[0].setPosition(angle);
    }
}
