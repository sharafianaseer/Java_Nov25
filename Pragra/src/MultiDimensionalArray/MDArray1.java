package MultiDimensionalArray;

import java.util.Scanner;

public class MDArray1 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int[][] array1= new int[3][3];
        int[][] array2= new int[3][3];
        int[][] array3 = new int[3][3];

        System.out.println("Enter the numbers in the first array : ");
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1[i].length; j++)
            {
                array1[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Enter the numbers in the second array : ");
        for (int i = 0; i < array2.length; i++)
        {
            for (int j = 0; j < array2[i].length; j++)
            {
                array2[i][j]=scanner.nextInt();
            }
        }

        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1[i].length; j++)
            {
                array3[i][j]=array1[i][j]+array2[i][j];
            }
        }

        System.out.println("The sum of the arrays :");
        for(int[] a:array3)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }


    }
}
