package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.teamcode.Devices.TrapDoorMechanic;
import org.firstinspires.ftc.teamcode.Navigation;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
/**
 * Created by adsweiger on 11/12/2016.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Pompeii: Autonomous", group="Pompeii")


public class Autonomous extends LinearOpMode {

    private FlyWheelMechanic flywheel;
    private TrapDoorMechanic trapDoor;
    private Navigation nav;


    @Override
    public void runOpMode() throws InterruptedException
    {
        flywheel = new FlyWheelMechanic(hardwareMap);
        trapDoor = new TrapDoorMechanic(hardwareMap);
        nav = new Navigation(hardwareMap);
        trapDoor.setPosition(.5);

        waitForStart();
        trapDoor.setPosition(0.5);
        nav.driveForward(0.3,2);
        flywheel.setPower(-0.75);
        Thread.sleep(3);
        trapDoor.setPosition(0);
        Thread.sleep(2);
        nav.driveForward(1,3);
        Thread.sleep(1);
        flywheel.setPower(0);

    }
}