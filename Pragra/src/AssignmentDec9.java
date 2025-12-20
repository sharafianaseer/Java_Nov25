import java.util.Scanner;

public class AssignmentDec9 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        int num=0;

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter a number : ");
            num = scanner.nextInt();
            if(num==0)
                {
                    i--;
                    continue;
                }
            else if(num<0)
                break;
            else
                    sum = sum + num;
                }
        System.out.println("Sum of the numbers = "+sum);
        }
    }

