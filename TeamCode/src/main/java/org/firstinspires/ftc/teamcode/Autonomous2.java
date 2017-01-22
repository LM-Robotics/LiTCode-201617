package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ThreadPool;

import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
import org.firstinspires.ftc.teamcode.Devices.TrapDoorMechanic;

/**
 * Created by wawilcoxon on 12/13/2016.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Pompeii: Autonomous2", group="Pompeii")

public class Autonomous2 extends LinearOpMode {
    private FlyWheelMechanic flywheel;
    private TrapDoorMechanic trapDoor;
    private Navigation nav;
    @Override
    public void runOpMode() throws InterruptedException {
        flywheel = new FlyWheelMechanic(hardwareMap);
        trapDoor = new TrapDoorMechanic(hardwareMap);
        nav = new Navigation(hardwareMap);
        trapDoor.setPosition(.5);
        waitForStart();
        Thread.sleep(15000);
        flywheel.setPower(-.8);
        nav.driveForward(.5,500);
        Thread.sleep(2000);
        trapDoor.setPosition(0);
        Thread.sleep(500);
        flywheel.setPower(0);
    }
}