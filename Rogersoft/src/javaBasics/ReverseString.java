package javaBasics;

public class ReverseString {

    public static void main(String[] args)
    {
        String s="Her name is Monica";
        String str="";
        char ch;
        int l = s.length();
        int n=s.indexOf('n');
        for(int i=n;i<l;i++)
        {
            ch=s.charAt(i);
            str=ch+str;
        }
        System.out.println(str);
    }
}
