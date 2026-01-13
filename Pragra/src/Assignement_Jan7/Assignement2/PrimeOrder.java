package Assignement_Jan7.Assignement2;

public class PrimeOrder extends Order{

    @Override
    void calculateFinalAmount(double amount) {
        System.out.println("The bill amount is "+(amount*0.9));
    }
}

 class FestivalOrder extends Order{
     @Override
     void calculateFinalAmount(double amount) {
         System.out.println("The bill amount is "+(amount*0.8));
     }
}
