package Assignement_Jan19.FoodOrdering;

public class PremiumOrder extends Order{

    PremiumOrder(int id, double amount)
    {
        super(id,amount);
    }

    @Override
    public double calculateFinalAmount() {
        return (getAmount()*.90);
    }

    public void printOrderSummary()
    {
        System.out.println("The total amount for the order "+getOrderId()+" is "+calculateFinalAmount()
        +", with free delivery....");
    }


}
