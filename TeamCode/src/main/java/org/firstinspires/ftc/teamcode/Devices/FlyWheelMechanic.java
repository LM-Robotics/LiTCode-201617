package org.firstinspires.ftc.teamcode.Devices;

/**
 * Created by Eamonn on 10/29/2016.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class FlyWheelMechanic
{

    private DcMotor[]  flymotor;

    DcMotor[] flywheel = new DcMotor[1];
    public FlyWheelMechanic (HardwareMap hardwareMap)
    {

        flywheel[0] = hardwareMap.dcMotor.get("forwardflywheel");


    }

    // Sets power of the two left motorsn
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
