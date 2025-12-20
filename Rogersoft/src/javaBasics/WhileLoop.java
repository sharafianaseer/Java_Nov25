package javaBasics;

import java.util.Scanner;

public record WhileLoop() {

    public static void main(String[] args)
    {
        int i=5;
        while(i>=2)
        {
            System.out.print("Hello"+i+" ");
            i--;
        }

        Scanner sc = new Scanner(System.in);
        //multiplication table
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        int a=1;

        while(a<=10)
        {
            System.out.println(a+"*"+n+"="+(a*n));
            a++;

        }
        int s=1;
        int sum = 0;
        while (s<=n)
        {
            sum =sum+s;
            s++;
        }
        double avg;
        avg= sum/n;
        System.out.println("Average = "+avg);


                //multiplication table and finding average
    }
}
