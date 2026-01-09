package Jan6_2026.Overriding;

public class Credit extends Payment{

//    public Credit(double amount) {
//        super(amount);
//    }

    @Override
    double credit(double amount)
    {
        System.out.println("Amount is credited");
        return balanceAmount+amount;
    }
}
