package org.firstinspires.ftc.teamcode.Devices;

/**
 * Created by Eamonn on 10/27/2016.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class SweeperMechanic
{
    private DcMotor[] sweeperMotor;

    public SweeperMechanic(HardwareMap hardwareMap)
    {
        sweeperMotor = new DcMotor[1];
        sweeperMotor[0] = hardwareMap.dcMotor.get("sweeperMechanicMotor");

    }
    public synchronized void setPower(double power)
    {
            // Set the motor power to power
        sweeperMotor[0].setPower(power);
    }
}
