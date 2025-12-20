package javaBasics;

import java.util.Scanner;

public class EvenNumbersWhileLoop {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int i=0, sum=0;
        while(i<=num)
        {
            sum=sum+i;
            i+=2;
        }
        System.out.println("Sum of even numbers till "+num+"="+sum);
        int a=0,ss=0;
        while(a<=num)
        {
            ss=ss+(a*a);
            a++;
        }
        System.out.println("Sum of squares till "+num+"="+ss);
    }
}


//HW: factors of a number