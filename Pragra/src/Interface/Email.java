package Interface;

public class Email implements Notifier{


    @Override
    public void notifyUser(String message) {
        System.out.println("Sending email notification..." +message);
    }
}
