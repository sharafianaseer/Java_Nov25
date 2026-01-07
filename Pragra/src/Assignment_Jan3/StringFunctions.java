package Assignment_Jan3;

import java.util.Arrays;

public class StringFunctions {

    public static void main(String[] args)
    {
       String s1="Java is fun";
       String s2=s1.replaceAll(" ","");
        System.out.println("Java is fun\n"+"No of chars: "+s1.length());
        System.out.println("Java is fun\n"+"No of chars without space: "+s2.length());

        String s3="Java is very powerful language";
        String[] s4=s3.split(" ");
        for(String a:s4)
            System.out.println(a );
        System.out.println("Java is very powerful language\n"+"No of words: "+s4.length);

        String s5 ="edsrfwtggvfdrfetf";
        StringBuilder result=new StringBuilder();
        for(char c:s5.toCharArray())
        {
            if(result.indexOf(String.valueOf(c))==-1)
            {
                result.append(c);
            }
        }
        System.out.println(s5+" without duplicates: "+result);

        String s6="Java is awesome";
        StringBuilder reverse=new StringBuilder();
        for (int i = s6.length()-1; i >=0 ; i--)
        {
            reverse.append(s6.charAt(i));
        }
        System.out.println(s6+" in reverse order : "+reverse);

        String[] splitWord=s6.split(" ");
        System.out.println(s6+" in reverse order(each word) : ");
        String result2="";
        for (String a:splitWord)
        {
            StringBuilder reverseWords= new StringBuilder();
            for (int i = a.length()-1; i >=0 ; i--)
            {
                reverseWords.append(a.charAt(i));
            }
           result2=result2+reverseWords+" ";

        }
        System.out.print(result2.trim()+"\n");

        String a1="silent";
        String a2="listen";
        System.out.println(a1+" : "+a2);
        char[] c1=a1.toCharArray();
        char[] c2=a2.toCharArray();
//        int num=0;
//        if(a1.length()==a2.length())
//        {
//        for (int i = 0; i < c1.length; i++)
//        {
//            for (int j = 0; j < c2.length; j++)
//            {
//                if(c1[i]==c2[j])
//                {
//                   num++;
//                   break;
//                }
//            }
//        }
//            System.out.println(num==c1.length?"The words are anagram":"The words are not anagram");
//        }
//        else
//            System.out.println("The words are not anagram");
        if(a1.length()!=a2.length())
        {
            System.out.println("The words are not anagram");
        }
        else
        {
            Arrays.sort(c1);
            Arrays.sort(c2);

            System.out.println(Arrays.equals(c1,c2)?"The words are anagram":"The words are not anagram");


        }





    }

}
