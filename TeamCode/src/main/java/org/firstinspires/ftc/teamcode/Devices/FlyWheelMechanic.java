package org.firstinspires.ftc.teamcode.Devices;

/**
 * Created by Eamonn on 10/29/2016.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotor.RunMode;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class FlyWheelMechanic
{
    private DcMotor[] flywheel;


    public FlyWheelMechanic (HardwareMap hardwareMap)
    {
        flywheel = new DcMotor[1];

        flywheel[0] = hardwareMap.dcMotor.get("forwardflywheel");
    }


    // Sets power of the two left motors
    public synchronized void setPower(double power)
    {

        flywheel[0].setPower(power);
    }

   //Sets the PID mode
   public synchronized void setMode(DcMotor.RunMode mode) {

    }
    //Tells PID what the target position is
    public synchronized void setTargetPosition(int position) {

    }

    public synchronized void setMaxSpeed(int encoderTicksPerSecond) {

    }


}