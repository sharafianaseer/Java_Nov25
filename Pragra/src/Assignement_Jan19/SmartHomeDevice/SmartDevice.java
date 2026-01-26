package Assignement_Jan19.SmartHomeDevice;

public abstract class SmartDevice {

    private int deviceId;

    public SmartDevice(int deviceId) {
        this.deviceId = deviceId;
    }

    void deviceInfo()
    {
        System.out.println("The device Id is "+deviceId);
    }
}
