package Jan6_2026.Overriding;

public class Payment {

    double balanceAmount;

    Payment(double balanceAmount)
    {
        this.balanceAmount=balanceAmount;
    }

    public Payment() {
    }

    double credit(double amount)
    {
        return balanceAmount+amount;
    }

    double debit(double amount)
    {
        return balanceAmount-amount;
    }
}
