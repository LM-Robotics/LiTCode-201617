package org.firstinspires.ftc.teamcode.Devices;

/**
 * Created by Eamonn on 10/29/2016.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class FlyWheelMechanic
{

    public DcMotor[]  flywheel;


    public FlyWheelMechanic (HardwareMap hardwareMap)
    {

        flywheel[0] = hardwareMap.dcMotor.get("forwardflywheel");


    }

    // Sets power of the two left motors
    public synchronized void setwheel(double power)
    {
        double convertedPower = ((double)power)/100.0;
        // for each motor in leftMotors
        for (DcMotor motor :flywheel){
            // Set the motor power to power
            motor.setPower(convertedPower);
        }
    }



  public synchronized void setPower(double wheelpower)
    {
        setwheel(wheelpower);

    }
}
