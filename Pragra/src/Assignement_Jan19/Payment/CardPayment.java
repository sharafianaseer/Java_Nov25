package Assignement_Jan19.Payment;

public class CardPayment implements PaymentMode{
    @Override
    public String pay(double amount) {
        return "Paying "+amount+" through Card....";
    }
}
