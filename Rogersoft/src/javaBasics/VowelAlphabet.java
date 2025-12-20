package javaBasics;

public class VowelAlphabet {

    public static void main (String[] args)

    {
        char c='a';
        /*if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("Character is a vowel");
        }
        else {
            System.out.println("Character is a consonent");
        }*/

        switch('c')
        {
            case('a'):System.out.println("Character is a vowel"); break;
            case('e'):System.out.println("Character is a vowel"); break;
            case('i'):System.out.println("Character is a vowel"); break;
            case('o'):System.out.println("Character is a vowel"); break;
            case('u'):System.out.println("Character is a vowel"); break;
            default: System.out.println("Character is a consonent"); break;
        }

    }
}
