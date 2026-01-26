package Assignement_Jan19.SmartHomeDevice;

import java.util.Scanner;

public class SmartMain {

    public static void main(String[] args){

        System.out.print("Enter the Fan id : ");
        Scanner sc = new Scanner(System.in);
        int fanId= sc.nextInt();
        System.out.println("Enter the light id : ");
        int lightId=sc.nextInt();

        SmartFan fan=new SmartFan(fanId);
        fan.deviceInfo();
        fan.turnOn();
        fan.turnoff();

        SmartLight light = new SmartLight(lightId);
        light.deviceInfo();
        light.turnOn();
        light.turnoff();

    }

}
