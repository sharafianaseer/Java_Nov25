import java.util.Scanner;

public class DrivingEligible {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the age: ");
        byte age= scanner.nextByte();

        if(age<18)
            System.out.println("You are not eligible for driving");
        else if(age>=18)
            System.out.println("You are eligible for driving");
        else
            System.out.println("Enter a valid age");

    }
}
