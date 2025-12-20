import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        byte num=0;
        while(num!=3){
            System.out.print("Enter your choice (1 or 2 or 3): ");
            num = scanner.nextByte();
            switch (num) {
                case 1: {
                    System.out.println("Hello");
                    break;
                }
                case 2: {
                    System.out.println("Good Evening");
                    break;
                }
                case 3: {
                    System.out.println("Exiting.....");
                    break;
                }
            }
        }
    }

    }

