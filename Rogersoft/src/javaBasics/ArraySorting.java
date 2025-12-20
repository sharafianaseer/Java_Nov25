package javaBasics;
import java.util.Scanner;


public class ArraySorting {

    public static void main(String[] args)
    {
        int[] num= new int[10];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        for(int i=0;i<10;i++)
        {
            num[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(num[i]>num[j])
                {
                    temp=num[j];
                    num[j]=num[i];
                    num[i]=temp;
                }
            }
        }
        System.out.println("The sorted array : ");
        for(int i=0;i<10;i++)
        {
            System.out.print(num[i]+" ");
        }

    }
}
