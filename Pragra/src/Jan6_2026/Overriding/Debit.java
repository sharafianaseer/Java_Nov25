package Jan6_2026.Overriding;

public class Debit extends Payment{

    Debit(double balanceAmount) {
        super(balanceAmount);
    }

    double debit(double amount)
    {
        System.out.println("Amount is debited");
        return balanceAmount-amount;
    }
}
