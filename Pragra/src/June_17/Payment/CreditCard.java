package June_17.Payment;

public class CreditCard extends Payment{
    @Override
    void validate() {
        System.out.println("Validating payment for Credit card.....");
        System.out.println("Validation successful for Credit card");
    }
}
