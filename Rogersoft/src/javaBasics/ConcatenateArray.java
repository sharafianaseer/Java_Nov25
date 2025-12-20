package javaBasics;

import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args)
    {
        String a[]=new String[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string : ");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.next();
        }
        String b = null;
        for(int i=0;i<10;i++)
        {
            b=b+a[i];
        }
        System.out.println(b);
    }
}
