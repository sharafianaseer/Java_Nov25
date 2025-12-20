import java.util.Scanner;

public class BankAccount {

    long accountNumber;
    double balance =0;

    void deposit(double amount)
    {
        balance+=amount;
    }

    void withdraw(double amount)
    {
        balance-=amount;
    }

    void displayBalance()
    {
        System.out.println("The balance amount in Acct No:"+accountNumber+" is "+balance);
    }
}

 class BankOperations{

    public static void main(String[] args)
    {
        System.out.println("Enter the account number: ");
        Scanner scanner = new Scanner(System.in);
        long accountNo=scanner.nextLong();
        BankAccount bk1 = new BankAccount();
        bk1.accountNumber=accountNo;
        char operation=' ';
        do {
            System.out.println("Choose the Operation (D for Deposit and W for Withdrawal) : ");
            operation = scanner.next().toUpperCase().charAt(0);
            System.out.println("Enter the amount: ");
            double amount = scanner.nextDouble();
            switch (operation) {
                case 'D': {
                    bk1.deposit(amount);
                    bk1.displayBalance();
                    break;
                }
                case 'W': {
                    bk1.withdraw(amount);
                    bk1.displayBalance();
                    break;
                }
                default:
                {
                    System.out.println("Enter a valid operation!!!");
                }
            }
        }while(operation!='D'||operation!='W');


    }
}
