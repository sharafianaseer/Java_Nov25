package javaBasics;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a single string");
        String s1=s.next();
        System.out.println("The string is "+s1);
        System.out.println("Enter a string");
        String s2=s.nextLine();
        System.out.println("The string is "+s2);
        System.out.println("Enter a character");
        char c=s.nextLine().charAt(0);
        System.out.println("The char is "+c);
        System.out.println("Enter a boolean :");
        boolean b=s.nextBoolean();
        System.out.println("The boolean is "+b);
        System.out.println("Enter a float number :");
        float f=s.nextFloat();
        System.out.println("The float number is :"+f);
    }
}
