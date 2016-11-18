package org.firstinspires.ftc.teamcode.Devices;

/**
 * Created by Eamonn on 10/27/2016.
 */
// TODO fix
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class SweeperMechanic
{
    private DcMotor axelRotation;

    public SweeperMechanic(HardwareMap hardwareMap)
    {
        axelRotation = hardwareMap.dcMotor.get("sweeperMechanicMotor");

    }
    public synchronized void setPower(double power)
    {
        axelRotation.setPower(power);
    }
}
