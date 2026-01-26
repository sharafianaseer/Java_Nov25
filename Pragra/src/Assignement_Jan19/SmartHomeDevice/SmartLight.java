package Assignement_Jan19.SmartHomeDevice;

public class SmartLight extends SmartDevice implements Switchable{

    SmartLight(int deviceId)
    {
        super(deviceId);
    }
    @Override
    public void turnoff() {
        System.out.println("Light turned off automatically");
    }

    @Override
    public void turnOn() {
        System.out.println("Light turned on automatically");
    }
}
