package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
import org.firstinspires.ftc.teamcode.Devices.SweeperMechanic;
import org.firstinspires.ftc.teamcode.Devices.TrapDoorMechanic;
import com.qualcomm.robotcore.hardware.ServoEx;



/**
 * Created by abnaveed on 10/13/2016.
 */

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Pompeii: Teleop Tank", group="Pompeii")
public class TeleOp extends OpMode
{
        //public DriveSystem drive;

    //  public FlyWheelMechanic flywheel;

        public SweeperMechanic sweeper;

//    public TrapDoorMechanic trapdoor;

    // TeleOp
    private static final float deadBand = .05f;

    @Override
    public void init()
    {
      //  flywheel = new FlyWheelMechanic(hardwareMap);
        sweeper = new SweeperMechanic(hardwareMap);
     //   trapdoor = new TrapDoorMechanic(hardwareMap);
        //drive = new DriveSystem(hardwareMap);
    }

    @Override
    public void loop()
    {

        // Getting joystick values
        /*double leftJoystick = gamepad1.left_stick_y;
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
        // Converting joystick values to motor power values



        /// flywheel
        /*boolean flyWheelPressed = gamepad2.right_bumper;
        if (flyWheelPressed)
        {
            flywheel.setPower(-1);
        }
        else
        {
            flywheel.setPower(0);
        }
        */
        boolean sweeperPressedDown = gamepad1.dpad_down;
        if (sweeperPressedDown)
        {
            sweeper.setPower(-1);
        }
        else
        {
            sweeper.setPower(0);
        }
        boolean sweeperPressedUp = gamepad1.dpad_up;
        if (sweeperPressedUp)
        {
            sweeper.setPower(1);
        }
        else
        {
            sweeper.setPower(0);
        }
    }
}
