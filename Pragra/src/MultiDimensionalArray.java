import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args){
         int[][] multiArray = new int[3][3];
         Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the marks: ");
        for (int i = 0; i < multiArray.length; i++)
        {
            for (int j = 0; j < multiArray[i].length; j++)
            {
                multiArray[i][j]=scanner.nextInt();
            }

        }

        for(int[] m:multiArray)
        {
            for(int a:m)
            {
                System.out.print(a + " ");
            }
            System.out.println();
        }



    }
}
