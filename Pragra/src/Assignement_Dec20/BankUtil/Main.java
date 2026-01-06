package Assignement_Dec20.BankUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int principle;
        float rate;
        byte time;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        principle=scanner.nextInt();
        System.out.print("Rate of Interest: ");
        rate=scanner.nextFloat();
        System.out.print("No. of years: ");
        time=scanner.nextByte();
        System.out.println("Interest calculated is "+Requirements.calculateInterest(principle,rate,time));

    }
}
