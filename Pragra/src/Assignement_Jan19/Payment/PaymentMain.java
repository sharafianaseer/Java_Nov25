package Assignement_Jan19.Payment;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order reference : ");
        int orderId=sc.nextInt();
        System.out.print("Enter the amount : ");
        double amount=sc.nextDouble();
        System.out.print("Enter the payment mode :");
        String mode = sc.next();
        System.out.println("Payment for order id : "+orderId);
        if(mode.equalsIgnoreCase("UPI"))
        {
            UPIPayment upi= new UPIPayment();
            System.out.println(upi.pay(amount));
        }else if(mode.equalsIgnoreCase("Card"))
        {
            CardPayment card=new CardPayment();
            System.out.println(card.pay(amount));
        }else
            System.out.println("Enter a valid payment mode....");


    }
}
