package June_17;

public abstract class RemoteControl {

    private void loadBattery()
    {
        System.out.println("Battery is loaded to the remote");
    }

    private void switchOn()
    {
        System.out.println("Remote is switched on");
    }

    public void start()
    {
        loadBattery();
        switchOn();
    }

    abstract void operate();
}
