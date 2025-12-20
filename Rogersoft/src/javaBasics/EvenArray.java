package javaBasics;

import java.util.Scanner;

public class EvenArray {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter 10 numbers : ");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] b=new int[10];
        for(int i=0,j=0;i<10;i++)
        {
            if(a[i]%2==0)
            {
                b[j++]=a[i];
            }
        }
        System.out.print("Even numbers in the array : ");
        for(int i=0;i<10;i++)
        {
            System.out.print(b[i]+" ");
        }

    }
}

//concatenate string array
//concatenate number array and sort
//count of each digit in the array
