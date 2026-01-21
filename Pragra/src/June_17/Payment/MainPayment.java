package June_17.Payment;

public class MainPayment {

    public static void main(String[] args){
        Payment pay = new CreditCard();
        pay.processPayment(3200);

        Payment pay2 = new PaypalPayment();
        pay2.processPayment(560.45);


    }
}
