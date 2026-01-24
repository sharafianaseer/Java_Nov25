package Assignement_Jan19;

public class RegularOrder extends Order{
    public RegularOrder(int id, double amount) {
        super(id, amount);
    }

    @Override
    public double calculateFinalAmount() {
        return (getAmount()*.9);
    }
}
