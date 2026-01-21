package Interface;

public class NotifierMain {

    public static void main(String[] args){

        Notifier notification = new Email();
        notification.notifyUser("Message send");

        Notifier notification1 = new SMS();
        notification1.notifyUser("Message send");

    }
}
