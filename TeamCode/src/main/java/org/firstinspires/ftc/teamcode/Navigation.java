package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.Devices.DriveSystem;

/**
 * Created by adsweiger on 11/12/2016.
 */
public class Navigation
{
    private DriveSystem drive;

    synchronized void driveForward (double power, long time) throws InterruptedException
    {
        drive.setBoth(power, power);
        Thread.sleep(time*1000);
    }

    public synchronized void turnRight (long angle) throws InterruptedException
    {
        drive.setBoth(1, -1);
        Thread.sleep(angle*1000);

    }

    public synchronized void turnLeft (long angle) throws InterruptedException
    {
        drive.setBoth(-1, 1);
        Thread.sleep(angle*1000);

    }

}
