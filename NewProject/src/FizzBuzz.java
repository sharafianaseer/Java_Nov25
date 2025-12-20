import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        long number = scanner.nextLong();
       /* if(number%5==0&&number%3==0)
            System.out.println("FizzBuzz");
        else if(number%5==0)
            System.out.println("Fizz");
        else if (number%3==0)
            System.out.println("Buzz");
        else
            System.out.println(number);*/
        String key="";
        if(number%5==0)
            key+="Fizz";
        if(number%3==0)
            key+="Buzz";
        switch(key) {
            case (""):
                System.out.println(number);
                break;
            default:
                System.out.println(key);
        }
        }
        }






