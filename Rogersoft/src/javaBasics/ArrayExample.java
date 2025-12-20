package javaBasics;

public class ArrayExample {

    public static void main(String[] args)
    {
        int[] a =new int[10];
        a[0]=2; a[1]=4; a[2]=5; a[3]=6;
        int[] b ={1,2,3,4,4,5,6,7,8,9};
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println();
        for(int i=0;i<10;i++)
        {
            System.out.print(b[i]+",");
        }
        System.out.println();
        int[] c = new int[10];
        for(int i = 0; i<10; i++)
        {
            c[i]=b[i]*b[i];
            System.out.print(c[i]+",");
        }

    }
}


