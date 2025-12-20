package javaBasics;

public class PriceBill {

    public static void main(String[] args) {

        String Custname= "Sharafia Naseer";
        String Date= "02-Jan-2024";
        int CustId= 12567;
        String item1="Bag", item2="Umbrella", item3= "Notebook";
        int qnty1= 1, qnty2 = 2;
        double pr1=425, pr2=300, pr3=50;
        double t1= pr1*qnty2, t2=pr2*qnty2, t3=pr3*qnty1;
        System.out.println("-------------------------------------------");
        System.out.println("Customer Name: "+Custname);
        System.out.println("Date: "+Date);
        System.out.println("Customer Id: "+CustId);
        System.out.println("----------------------------------------------");
        System.out.println("| Item     |  Quantity  |  Price/Pc  | Total |");
        System.out.println("----------------------------------------------");
        System.out.println("| "+item1+"      | "+qnty2+"          | "+pr1+"      | "+t1+" | ");
        System.out.println("| "+item2+" | "+qnty2+"          | "+pr2+"      | "+t2+" | ");
        System.out.println("| "+item3+" | "+qnty1+"          | "+pr3+"       | "+t3+"  | ");
        System.out.println("----------------------------------------------");
        System.out.println("|                Total Amount"+"        | "+(t1+t2+t3)+"|");
        System.out.println("----------------------------------------------");

    }
}
