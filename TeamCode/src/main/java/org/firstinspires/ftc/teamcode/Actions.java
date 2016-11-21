package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.Devices.DriveSystem;
import org.firstinspires.ftc.teamcode.Devices.FlyWheelMechanic;
import org.firstinspires.ftc.teamcode.Devices.SweeperMechanic;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;


/**
 * Created by adsweiger on 11/12/2016.
 */
@Autonomous(name = "name = Pompeii: Autonomous Tank", group = "Sensor")
public class Actions {
    public DriveSystem drive;


    public void inti(){
        drive = new DriveSystem(hardwareMap);
    }
    public void loop(){


    }
}
