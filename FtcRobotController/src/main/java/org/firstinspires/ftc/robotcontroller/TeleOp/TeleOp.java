package org.firstinspires.ftc.robotcontroller.internal.Devices;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by abnaveed on 10/13/2016.
 */


public class TeleOp extends OpMode
{
    // TeleOp
    public DcMotor leftMotor = null;
    public DcMotor rightMotor = null;

    @Override
    public void init()
    {

    }

    @Override
    public void loop()
    {
        // Getting joystick values
        double leftJoystick = gamepad1.left_stick_y;
        double rightJoystick = gamepad1.right_stick_y;
        // Converting joystick values to motor power values
        rightMotor.setPower(rightJoystick);
        leftMotor.setPower(leftJoystick);
    }
}
