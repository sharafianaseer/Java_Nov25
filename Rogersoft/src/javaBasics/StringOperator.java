package javaBasics;

public class StringOperator {

    public static void main (String[] args)
    /*{
        String s1= "Hello Good Morning";
        System.out.println(s1.replace('o','u'));
        System.out.println(s1.replace("Good","Gd"));
        System.out.println(s1);
        System.out.println(s1.replaceAll(s1,"Have a nice Day"));
        System.out.println(s1.concat("Everyone"));
        System.out.println(s1+"Everyone");

    }*/ {
        String num1 = "78";
        String num2 = "52";
        int n1= Integer.parseInt(num1);
        int n2= Integer.parseInt(num2);
        System.out.println(n1+n2);
        System.out.println(num1+num2);
        String num3= String.valueOf(n1);
        String num4=String.valueOf(n2);
        System.out.println(num3+num4);
    }
}
