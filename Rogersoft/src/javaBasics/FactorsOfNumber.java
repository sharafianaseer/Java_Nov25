package javaBasics;

import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i = 1;
        System.out.println("Factors are : ");
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i + "");
            }
            i++;
        }
        int x = 2, count = 0;
        while (x < num) {
            if (num % x == 0) {
                count = 1;
                break;
            }
            x++;
        }
        if (count == 1) {
            System.out.println("The number is not a prime number");
        } else {
            System.out.println("The number is a prime number");
        }


        int f1 = 1, f2 = 0, f3 = 0, x2 = 1;
        while (x2 <= num) {
            System.out.println(f3);
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            x2++;
        }


    }
}