import java.util.Scanner;

public class Readinput {

    public static void main(String[] args)
    {
        System.out.print("Enter your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        System.out.println("Your name is "+name);
    }


}
