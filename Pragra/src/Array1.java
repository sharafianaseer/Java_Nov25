import java.util.Scanner;

public class Array1 {

    static void main(String[] args) {

        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int a: arr)
        {
            System.out.println(a);
        }

    }
}
