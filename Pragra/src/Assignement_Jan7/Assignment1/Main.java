package Assignement_Jan7.Assignment1;

public class Main {

    public static void main(String[] args){
     Notification n1= new EmailNotification();
     n1.send("Email Notification");
     Notification n2= new PushNotification();
     n2.send("Push Notification");
     Notification n3= new SMSNotification();
     n3.send("SMS notification");

    }
}
