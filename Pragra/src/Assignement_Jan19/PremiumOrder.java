package Assignement_Jan19;

public class PremiumOrder extends Order{

    PremiumOrder(int id, double amount)
    {
        super(id,amount);
    }

    @Override
    public double calculateFinalAmount() {
        return (getAmount()*1.20);
    }


}
