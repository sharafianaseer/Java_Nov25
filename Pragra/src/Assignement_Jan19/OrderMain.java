package Assignement_Jan19;

public class OrderMain {

    public static void main(String[] args){

        Order ord1 = new RegularOrder(123, 345.80);
        ord1.printOrderSummary();

        Order ord2 = new PremiumOrder(345, 345.80);
        ord2.printOrderSummary();
    }
}
