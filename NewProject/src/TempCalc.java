import java.util.Scanner;

public class TempCalc {

    public static void main(String[] args)
    {
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's temperature:");
        short temperature = scanner.nextShort();
        if(temperature>30)
            System.out.println("Its's a hot day\nDrink plenty of water");
        else if(temperature>20 && temperature<30)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        short income =  scanner.nextShort();
        /*boolean highIncome=(income>10000);
        if(highIncome)
            System.out.println("High Income");
        else
            System.out.println("Not High Income");*/
        System.out.println(income>10000?"High Income":"Not High income");
    }
}
