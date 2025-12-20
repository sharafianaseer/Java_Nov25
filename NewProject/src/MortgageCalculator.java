import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        final byte NO_OF_MONTHS = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        float principle=0;
        float interestRate=0;
        byte years=0;
        while(true) {
            System.out.print("Principle ($1K - $1M): ");
            principle = scanner.nextFloat();
            if (principle>= 1000&&principle<= 1000000) {
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000. :");
        }

        while(true){
            System.out.print("Annual Interest Rate: ");
            interestRate = scanner.nextFloat();
            if(interestRate>0&&interestRate<100) {
              break;
            }
            System.out.println("Enter a value greater than zero and less than 100.");
        }

        while(true){
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if(years>=1&&years<=30) {
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
            }
        int months = years * NO_OF_MONTHS;
        float interest = interestRate / (NO_OF_MONTHS * PERCENT);
        /*double factor=1;
        for(int i=1;i<=months;i++)
        {
            factor = (1+interest)*factor;
        }*/
        //double x=(1+interest);
        double factor = Math.pow(1 + interest, months);
        double mortgage = principle * ((interest * factor) / (factor - 1));
        System.out.println("Mortgage =" + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
