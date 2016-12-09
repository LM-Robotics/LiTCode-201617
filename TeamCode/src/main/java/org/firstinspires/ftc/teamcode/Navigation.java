package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.Devices.DriveSystem;

/**
 * Created by adsweiger on 11/12/2016.
 */
public class Navigation
{
    public DriveSystem drive;

    public synchronized void driveForward (double power, long time) throws InterruptedException
    {
        drive.setBoth(power, power);
        Thread.sleep(time*1000);
    }
    public synchronized void turnRight (double power, long time) throws InterruptedException
    {
        drive.setBoth(power, -power);
        Thread.sleep(time*1000);

    }
    public synchronized void turnLeft (double power, long time) throws InterruptedException
    {
        drive.setBoth(-power, power);
        Thread.sleep(time*1000);

    }

}
