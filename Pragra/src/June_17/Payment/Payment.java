package June_17.Payment;

public abstract class Payment {

    abstract void validate();
    void processPayment(double amount)
    {
        validate();
        System.out.println("The amount "+amount + " is processed");
    }


}
