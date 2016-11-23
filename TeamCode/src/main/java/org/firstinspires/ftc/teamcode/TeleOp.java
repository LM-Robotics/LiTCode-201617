package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
import org.firstinspires.ftc.teamcode.Devices.SweeperMechanic;
import org.firstinspires.ftc.teamcode.Devices.TrapDoorMechanic;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import static org.firstinspires.ftc.robotcontroller.external.samples.HardwareK9bot.CLAW_MAX_RANGE;
import static org.firstinspires.ftc.robotcontroller.external.samples.HardwareK9bot.CLAW_MIN_RANGE;


/**
 * Created by abnaveed on 10/13/2016.
 */

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Pompeii: Teleop Tank", group="Pompeii")
public class TeleOp extends OpMode
{
        //public DriveSystem drive;

      public FlyWheelMechanic flywheel;

        public SweeperMechanic sweeper;



    // TeleOp
    /*double trapdoor_MIN_RANGE=0.20;
    double trapdoor_MAX_RANGE=0.90;
    double trapdoorPosition;
    double trapdoorDelta = 0.1;
    Servo trapdoor;*/


    @Override
    public void init()
    {
        flywheel = new FlyWheelMechanic(hardwareMap);
        sweeper = new SweeperMechanic(hardwareMap);
       // drive = new DriveSystem(hardwareMap);
    }

    @Override
    public void loop()
    {

        // Getting joystick values
       /* double leftJoystick = gamepad1.left_stick_y;
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
        }*/


        //set motor power
         //Converting joystick values to motor power values



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

        /*trapdoor = hardwareMap.servo.get("servo_6");
        trapdoorPosition = 0.20;
        boolean trapdoorPressedDown = gamepad1.right_trigger;
        boolean trapdoorPressedUp = gamepad1.left_trigger;
        if (trapdoorPressedDown) {
        trapdoorPosition += trapdoorDelta;

    }
        if (trapdoorPressedUp) {
            trapdoorPosition -= trapdoorDelta;
        }


        trapdoorPosition = Range.clip(trapdoorPosition, trapdoor_MIN_RANGE, trapdoor_MAX_RANGE);


        trapdoor.setPosition(trapdoorPosition);*/


    }

}



