package Assignement_Jan19.SmartHomeDevice;

public class SmartFan extends SmartLight implements Switchable{
    SmartFan(int deviceId) {
        super(deviceId);
    }

    @Override
    public void turnoff() {
        System.out.println("Fan is turned off automatically");
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is turned on automatically");
    }
}
