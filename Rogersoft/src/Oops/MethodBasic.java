package Oops;

import java.util.Scanner;

public class MethodBasic {

    public static void main(String[] args)
    {
        MethodBasic obj = new MethodBasic();
        obj.addition();
        System.out.println(obj.substraction());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a even number : ");
        int num=sc.nextInt();
        System.out.println(evenorodd(num));
        System.out.println("Enter a prime number : ");
        int num1=sc.nextInt();
        System.out.println(obj.prime(num1));
        System.out.println("Enter the mark : ");
        int num3=sc.nextInt();
        System.out.println( grade(num3)+" Grade");
    }


    public void addition()
    {
        int a = 3, b = 5;
        int sum = a + b;
        System.out.println(sum);
    }

    public int substraction() {
        int a = 10, b = 8;
        int sub = a - b;
        return sub;
    }

    public static boolean evenorodd(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else return false;
    }

    public static boolean prime(int num)
    {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            if (num%i==0)
            {
                count++;
            }
        }
        if (count==1) return true;
        else return false;
    }
    public static char grade(int num)
    {
        if (num<=100&&num>80) return 'A';
        if (num<=80&&num>60) return 'B';
        if (num<=60&&num>40) return 'C';
        if (num<=40&&num>20) return 'D';
        else return 'E';
    }
}

//even or odd
//prime or not
