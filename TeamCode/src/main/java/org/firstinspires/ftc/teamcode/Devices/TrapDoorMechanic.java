package org.firstinspires.ftc.teamcode.Devices;
<<<<<<< HEAD

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
=======
>>>>>>> 718d436490e53b65cf45db7fea7ade0897ff8c04
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * Created by Eamonn on 10/29/2016. Funtastic.
 */


public class TrapDoorMechanic
{
    Servo[] trapDoor;

    public TrapDoorMechanic(HardwareMap hardwareMap)
    {
        trapDoor = new Servo[1];
        trapDoor[1] = hardwareMap.servo.get("trapDoorServo");
    }

    public synchronized void setPosition(double angle)
    {
            // Set the motor power to power
            trapDoor[1].setPosition(angle);
    }

}

