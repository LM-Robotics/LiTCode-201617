package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.teamcode.Devices.TrapDoorMechanic;
import org.firstinspires.ftc.teamcode.Navigation;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
/**
 * Created by adsweiger on 11/12/2016.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Pompeii: Autonomous", group="Pompeii")


public class Autonomous extends LinearOpMode {
    public FlyWheelMechanic flywheel;
    public DriveSystem drive;
    public TrapDoorMechanic trapDoor;
    public Navigation nav;
    @Override
    public void runOpMode() throws InterruptedException
    {
        drive = new DriveSystem(hardwareMap);
        flywheel = new FlyWheelMechanic(hardwareMap);
        trapDoor = new TrapDoorMechanic(hardwareMap);
        nav = new Navigation();
        waitForStart();
        flywheel.setPower(1);
        Thread.sleep(1);
        trapDoor.setPosition(0);
        nav.driveForward(1,4);
    }



}
