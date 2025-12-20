package javaBasics;

public class MultiDimensionalArray {

    public static void main(String[] args)
    {
        int a[][]={{6,8,9,2},{3,7,8,1},{6,8,4,2},{0,3,0,6}};
        for(int i =0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
