package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
import org.firstinspires.ftc.teamcode.Devices.TrapDoorMechanic;

/**
 * Created by wawilcoxon on 12/13/2016.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Pompeii: Autonomous2", group="Pompeii")

public class Autonomous2 extends LinearOpMode {
    private FlyWheelMechanic flywheel;
    private DriveSystem drive;
    private TrapDoorMechanic trapDoor;
    private Navigation nav;
    @Override
    public void runOpMode() throws InterruptedException {
        drive = new DriveSystem(hardwareMap);
        flywheel = new FlyWheelMechanic(hardwareMap);
        trapDoor = new TrapDoorMechanic(hardwareMap);
        nav = new Navigation();

        waitForStart();

    }
}