package Jan_13.Bank;

public class BankAccount {

    private double balance;

    BankAccount(double initialBalance){
        if(initialBalance>=0){
            this.balance=initialBalance;
        }
    };

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance =balance;
    }

    public void deposit(double amount)
    {
        if(amount<0)
        {
            System.out.println("The amount is negative");
        }
        else {
            balance+=amount;
            System.out.println("Your current balance is " +balance);
        }
    }

    public void withdrawal(double amount)
    {
        if(amount>balance)
        {
            System.out.println("No sufficient balance");
        }
        else {
            balance-=amount;
            System.out.println("Your current balance is " +balance);
        }
    }

    public void showBalance()
    {
        System.out.println("Your current balance is "+balance);
    }
}
