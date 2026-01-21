package Interface;

public class SMS implements Notifier{

    public void notifyUser(String message)
    {
        System.out.println("Sending SMS notification...."+message);
    }
}
