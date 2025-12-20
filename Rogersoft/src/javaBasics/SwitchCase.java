package javaBasics;

public class SwitchCase {

    public static void main(String[] args)
    {
        char choice = 'm';
        int a=10, b=5;
        switch(choice) {
            case ('a'):
                System.out.println("Sum = " + (a + b));
                break;
            case ('s'):
                System.out.println("Minus = " + (a - b));
                break;
            case ('m'):
                System.out.println("Multiplication = " + (a * b));
                break;
            case ('d'):
                System.out.println("Division = " + (a / b));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
