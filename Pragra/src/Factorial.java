import java.util.Scanner;

public class Factorial {

    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number: ");
        byte number= scanner.nextByte();
        int j=1;
        for(int i=1;i<=number;i++)
        {
            System.out.print(i);
            j=j*i;
            if(i==number)
                break;
                System.out.print("*");

        }
        System.out.println("\nThe factorial of "+number+" is "+j);

    }
}
