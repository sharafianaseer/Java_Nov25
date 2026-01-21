package Jan_13.Bank;

public class BankMain {

    public static void main(String[] args){
     BankAccount bk= new BankAccount(100);

     bk.deposit(500);
     bk.deposit(-2000);

     bk.withdrawal(400);
     bk.withdrawal(100000);

     bk.showBalance();
    }
}
