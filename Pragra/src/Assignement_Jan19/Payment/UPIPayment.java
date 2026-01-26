package Assignement_Jan19.Payment;

public class UPIPayment implements PaymentMode{


    @Override
    public String pay(double amount) {
        return "Paying "+amount +" using UPI....";
    }
}
