package javaBasics;

import java.util.Scanner;

public class LargestNumberArray {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter 10 numbers : ");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
    int max=0;
        for(int i=0;i<10;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }

        System.out.println("The Largest number is : "+max);
            System.out.println("Enter the number you want check in the array : ");
            int key=sc.nextInt();
            for(int i=0;i<10;i++)
            {
                if(a[i]==key)
                {
                    System.out.println("true");
                }
            }
            System.out.println("Reverse order of the array : ");
            int[] b=new int[10];
            for(int i=0,j=9;i<10;i++)
            {
                b[j--]=a[i];
            }
            for(int i=0;i<10;i++)
            {
                System.out.print(b[i]+" ");
            }


    }
}
