package Assignement_Dec20;

import java.util.Scanner;

public class Marksheet {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks of 3 students:");
        int[][] marks = new int[3][3];
        for (int i = 0; i < marks.length; i++)
        {
            for (int j = 0; j < marks[i].length; j++)
            {
               marks[i][j]=scanner.nextInt();
            }

        }

        System.out.println("Total per student :");
        int totalSum=0;
        for(int[] a: marks)
        {
            int sum=0;
            for(int j:a)
            {
                sum=sum+j;
                totalSum+=j;
            }
            System.out.println(sum);
        }
        System.out.println("The total sum of marks :"+totalSum);


    }
}
