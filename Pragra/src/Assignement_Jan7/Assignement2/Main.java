package Assignement_Jan7.Assignement2;

public class Main {

    public static void main(String[] args){
        Order o1= new Order();
        o1.calculateFinalAmount(500);
        Order o2= new RegularOrder();
        o2.calculateFinalAmount(800);
        Order o3=new PrimeOrder();
        o3.calculateFinalAmount(400);
        Order o4=new FestivalOrder();
        o4.calculateFinalAmount(300);

    }
}
