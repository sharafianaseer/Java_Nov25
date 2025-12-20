class Calculator{
     public int add(int n1,int n2){
         return n1+n2;
     }

     public void musicPlaying(){
         System.out.println("Playing music");
     }

     public int add(int n1,int n2,int n3,short n4){
         return n1+n2+n3+n4;
     }
}

public class Methods {

    public static void main(String[] args)
    {   int num1=2;
        int num2=7;
        int num3=8;
        int num4=10;
        Calculator calc1= new Calculator();
        calc1.musicPlaying();
        int result1=calc1.add(num1,num2);
        int result2=calc1.add(num1,num2,num3,(short)num4);
        System.out.println(result1+"+"+result2);

    }
}

