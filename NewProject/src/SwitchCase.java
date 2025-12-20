import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your role: ");
        String role = scanner.nextLine();
        switch (role){
            case "admin":
            System.out.println("You are an admin");
            break;
            case "moderator":
            System.out.println("You are a moderator");
            break;
            default:
                System.out.println("You have no role");
        }
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        switch(age) {
            case 23,32->
                {
                    System.out.println("You are 23");
                    System.out.println("You are 32");
                }
                //break;
            case 24->
                System.out.println("You are 24");
               // break;
            default->
                System.out.println("You are more than 23");
        }
    }
}
