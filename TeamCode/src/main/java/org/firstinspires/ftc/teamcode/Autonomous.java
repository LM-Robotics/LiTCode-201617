package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.teamcode.Navigation;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
/**
 * Created by adsweiger on 11/12/2016.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Pompeii: Autonomous", group="Pompeii")


public class Autonomous extends LinearOpMode {
    public Navigation nav;
    public DriveSystem drive;
    @Override
    public void runOpMode() throws InterruptedException
    {
        drive = new DriveSystem(hardwareMap);
        waitForStart();
        driveForward(1,5);

    }
    public synchronized void driveForward (double power, long time) throws InterruptedException
    {
        drive.setLeft(power);
        Thread.sleep(time*1000);
        drive.setLeft(0);
    }
    public synchronized void turnRight (double power, long angle) throws InterruptedException
    {
        drive.setBoth(power, -power);
        Thread.sleep(angle);
        drive.setBoth(0,0);

    }
    public synchronized void turnLeft (double power, long angle) throws InterruptedException
    {
        drive.setBoth(-power, power);
        Thread.sleep(angle);
        drive.setBoth(0,0);

    }


}
