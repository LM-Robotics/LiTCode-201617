package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
import org.firstinspires.ftc.teamcode.Devices.SweeperMechanic;
import org.firstinspires.ftc.teamcode.Devices.TrapDoorMechanic;


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
    }
    @Override
    public void loop()
    {
        if(gamepad1.left_stick_y > 0.05 || gamepad1.left_stick_y < -0.05)
        {
           drive.setLeft(gamepad1.left_stick_y);
        }
        else
        {
            drive.setLeft(0);
        }

        if (gamepad1.right_stick_y > 0.05 || gamepad1.right_stick_y < -0.05)
        {
            drive.setRight(gamepad1.right_stick_y);
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
            flywheel.setPower(-0.5);
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
    }
}