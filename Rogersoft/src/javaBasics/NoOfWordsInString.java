package javaBasics;

import java.util.Scanner;

public class NoOfWordsInString {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        //System.out.println(s);
        int count=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                count++;
            }

        }
        System.out.println("The length of the string is : "+(++count));
        }

    }

