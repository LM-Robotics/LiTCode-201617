package org.firstinspires.ftc.teamcode.Devices.BeaconPresserServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by LMRobotics on 1/7/2017.
 */

public class beaconServo
{
    private Servo[] beaconServo;
    public beaconServo(HardwareMap hardwareMap)
    {
        beaconServo = new Servo[1];
        beaconServo[0] = hardwareMap.servo.get("beaconServo");
    }
    public synchronized void setBeaconPosition(double position)
    {
        beaconServo[0].setPosition(0);
    }
    public synchronized void getCurrentPosition(double position)
    {
        // Accesses the current position of the beacon presser
        beaconServo[0].getPosition();
    }
}
