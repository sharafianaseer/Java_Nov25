package Jan20_Exceptions;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                array[i] = sc.nextInt();
            }
        }catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
