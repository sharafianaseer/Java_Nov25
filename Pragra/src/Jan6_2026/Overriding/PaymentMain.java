package Jan6_2026.Overriding;

public class PaymentMain {

    public static void main(String[] args){

        Payment payment=new Payment(1000);
        System.out.println(payment.credit(500));
        System.out.println(payment.debit(300));

        Credit cr=new Credit();
        cr.balanceAmount=500;
        System.out.println(cr.credit(500));
        System.out.println(cr.debit(300));
    }
}
