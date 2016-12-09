package org.firstinspires.ftc.teamcode.Devices;

/**
 * Created by Eamonn on 10/27/2016.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class SweeperMechanic
{
    private DcMotor[] sweeper;

    public SweeperMechanic(HardwareMap hardwareMap)
    {
        sweeper = new DcMotor[1];
        sweeper[0] = hardwareMap.dcMotor.get("sweeperMotor");

    }
    public synchronized void setPower(double power)
    {

            // Set the motor power to power
        sweeper[0].setPower(power);
    }
}
