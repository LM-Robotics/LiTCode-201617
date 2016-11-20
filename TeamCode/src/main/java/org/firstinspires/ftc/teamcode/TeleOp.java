package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
import org.firstinspires.ftc.teamcode.Devices.SweeperMechanic;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/**
 *Created by abnaveed on 10/13/2016.
 */

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Pompeii: Teleop Tank", group="Pompeii")

public class TeleOp extends OpMode
{

    private DriveSystem drive;

    private FlyWheelMechanic flywheel;

    private SweeperMechanic sweeper;

    double trapdoor_MAX_RANGE=0.90;

    double trapdoor_MIN_RANGE = 0.20;

    double trapdoorPosition;

    double trapdoorDelta = 0.1;

    Servo trapdoor;

    @Override

    public void init()
    {

        flywheel = new FlyWheelMechanic(hardwareMap);

        sweeper = new SweeperMechanic(hardwareMap);

        drive = new DriveSystem(hardwareMap);
    }


    @Override

    public void loop()
    {


        // Getting joystick values

        double leftJoystick = gamepad1.left_stick_y;

        double rightJoystick = gamepad1.right_stick_y;

        if(leftJoystick > 0.05 || leftJoystick < -0.05)
        {
           drive.setLeft(leftJoystick);
        }

        else {
            drive.setLeft(0);
        }


        if (rightJoystick > 0.05 || rightJoystick < -0.05)
        {
            drive.setRight(rightJoystick);
        }

        else {
            drive.setRight(0);
        }

        //flywheel

        boolean flyWheelPressed = gamepad2.right_bumper;

        if (flyWheelPressed)
        {
            flywheel.setPower(-1);
        }

        else
        {
            flywheel.setPower(0);
        }


        boolean sweeperPressedDown = gamepad1.dpad_down;

        boolean sweeperPressedUp = gamepad1.dpad_up;

        if (sweeperPressedDown)
        {
            sweeper.setPower(-1);
        }

        else if (sweeperPressedUp)
        {
            sweeper.setPower(1);
        }


        else
        {
            sweeper.setPower(0);
        }

        trapdoor = hardwareMap.servo.get("trapDoorMechanic");

        trapdoorPosition = 0.20;

        boolean trapdoorPressedDown = gamepad1.x;

        boolean trapdoorPressedUp = gamepad1.y;

        if (trapdoorPressedDown) {
            trapdoorPosition += trapdoorDelta;

        }if (trapdoorPressedUp) {
            trapdoorPosition -= trapdoorDelta;
        }

        trapdoorPosition = Range.clip(trapdoorPosition, trapdoor_MIN_RANGE, trapdoor_MAX_RANGE);

        trapdoor.setPosition(trapdoorPosition);


    }

}



