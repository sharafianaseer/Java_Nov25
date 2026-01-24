package Jan24;

import java.util.Scanner;

public class AgeMain {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age :");
        Age a= new Age(sc.nextInt());
        try{
            a.drivingEligibility();
        }catch(UnderEligible e)
        {
            e.printStackTrace();
        }

    }
}
