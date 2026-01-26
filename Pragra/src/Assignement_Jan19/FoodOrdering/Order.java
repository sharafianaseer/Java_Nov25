package Assignement_Jan19.FoodOrdering;

public abstract class Order {

    private int orderId;
    private double amount;

    Order(int id, double amount)
    {
       this.orderId=id;
       this.amount=amount;
    }

    public double getAmount()
    {
        return this.amount;
    }
    public int getOrderId()
    {
        return this.orderId;
    }

    public abstract double calculateFinalAmount();

    void printOrderSummary()
    {
        System.out.println("The total amount for the order "+orderId+" is "+calculateFinalAmount());
    }


}
