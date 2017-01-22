package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
import org.firstinspires.ftc.teamcode.Devices.SweeperMechanic;
import org.firstinspires.ftc.teamcode.Devices.TrapDoorMechanic;
import org.firstinspires.ftc.teamcode.Devices.BeaconPresserServo.beaconServo;
import com.qualcomm.robotcore.hardware.DcMotor;



/**
 * Created by abnaveed on 10/13/2016.
 */

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Pompeii: Teleop Tank", group="Pompeii")
public class TeleOp extends OpMode
{
    private DriveSystem drive;
    private FlyWheelMechanic flywheel;
    private SweeperMechanic sweeper;
    private TrapDoorMechanic trapdoor;
    private beaconServo beacon;

    private boolean beaconPosition = false;
    private boolean xPressedOff = false;
    private boolean bumperPressedOff = false;
    private boolean flyWheelOn = false;
    private boolean buttonAPressedOff = false;
    private boolean trapDoorDown =  false;
    // TeleOp
    @Override
    public void init()
    {
        flywheel = new FlyWheelMechanic(hardwareMap);
        sweeper = new SweeperMechanic(hardwareMap);
        trapdoor = new TrapDoorMechanic(hardwareMap);
        drive = new DriveSystem(hardwareMap);
        beacon = new beaconServo(hardwareMap);
        flywheel.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        flywheel.setTargetPosition(200);
    }
    @Override
    public void loop()
    {
        double leftStick = gamepad1.left_stick_y;

        double rightStick = gamepad1.right_stick_y;

        int encoderPosition = flywheel.getCurrentPosition();
        telemetry.addData("Encoder Position", encoderPosition);

        if(leftStick > 0.05 || leftStick < -0.05)
        {
           drive.setLeft(leftStick);
        }
        else
        {
            drive.setLeft(0);
        }

        if (rightStick > 0.05 || rightStick< -0.05)
        {
            drive.setRight(rightStick);
        }
        else
        {
            drive.setRight(0);
        }

        if (!(gamepad2.a))
        {
            buttonAPressedOff = true;
        }

        if (trapDoorDown && gamepad2.a && buttonAPressedOff)
        {
            trapDoorDown = false;
            buttonAPressedOff = false;
        }
        else if (!(trapDoorDown) && gamepad2.a && buttonAPressedOff)
        {
            trapDoorDown = true;
            buttonAPressedOff = false;
        }

        if (trapDoorDown)
        {
            trapdoor.setPosition(0);
        }
        else
        {
            trapdoor.setPosition(0.5);
        }

        if (!(gamepad2.right_bumper))
        {
            bumperPressedOff = true;
        }

        if (flyWheelOn && gamepad2.right_bumper && bumperPressedOff)
        {
            flyWheelOn = false;
            bumperPressedOff = false;
        }
        else if (!(flyWheelOn) && gamepad2.right_bumper && bumperPressedOff)
        {
            flyWheelOn = true;
            bumperPressedOff = false;
        }

        if (flyWheelOn)
        {

            flywheel.setPower(-.8);
        }
        else
        {
            flywheel.setPower(0);
        }

        if (gamepad2.dpad_down)
        {
            sweeper.setPower(-1);
        } else if (gamepad2.dpad_up)
        {
            sweeper.setPower(1);
        }
        else
        {
            sweeper.setPower(0);
        }

        if (!(gamepad2.x))
        {
            xPressedOff = true;
        }
        if (gamepad2.x && xPressedOff && beaconPosition)
        {
            beaconPosition = false;
            xPressedOff = false;
            beacon.setBeaconPosition(0);
        }
        else if (gamepad2.x && xPressedOff&& !(beaconPosition))
        {
            beaconPosition = true;
            xPressedOff = false;
            beacon.setBeaconPosition(.4);
        }
    }
}