public class Main{

    public static void main(String[] args){

        int x=34;
        int y=45;
        int add = x+y;
        int sub =x-y;
        int mult = x*y;
        float div = (float)x/y;
        System.out.println("My numbers are "+x+" and "+y);
        System.out.println("Addition: "+add);
        System.out.println("difference: "+sub);
        System.out.println("multiplication: "+mult);
        System.out.println("Division: "+div);

        int swap = x+y;
        x = swap-x;
        y = swap-x;
        System.out.println("After swapping, the number are "+x+" and "+y);
        int z=55;
        System.out.println("Average of three :"+(x+y+z)/3);
        int mod1= x%2;
        int mod2= y%2;
        int mod3= z%2;
        System.out.println("The first number is "+((mod1==0)?"Even":"Odd"));
        System.out.println("The second number is "+((mod2==0)?"Even":"Odd"));
        System.out.println("The third number is "+((mod3==0)?"Even":"Odd"));
        int largest=0;
        if(x>=y&&x>=z)
            largest=x;
        else if(y>=z&&y>=x)
            largest=y;
        else
            largest=z;

        int smallest=0;
        if(x<=y&&x<=z)
            smallest=x;
        else if(y<=x&&y<=z)
            smallest=y;
        else
            smallest=z;
        System.out.println("The largest number = "+largest);
        System.out.println("The smallest number = "+smallest);
        byte age =3;
        System.out.println("The age is "+age);
        System.out.println((age>18)?"Eligible for voting":"Not eligible for voting");
    }
}