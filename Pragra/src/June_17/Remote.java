package June_17;

public class Remote extends RemoteControl{
    @Override
    void operate() {
        start();
        System.out.println("TV is operating");
    }
}
