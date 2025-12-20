package Oops;

public class MethodOverloading {

    public static void main(String[] args)
    {
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.Addition(3,2));
        System.out.println(obj.Addition(3,2,6,8));
        System.out.println(obj.Addition(3,2,3.678,8));
        System.out.println(obj.Addition(3.765,2,7,9));
    }

    public int Addition(int a, int b)
    {
        return a+b;
    }
    public int Addition(int a, int b,int c, int d)
    {
        return a+b+c+d;
    }
    public double Addition(int a, int b,double c, int d)
    {
        return a+b+c+d;
    }
    public double Addition(double a, int b,int c, int d)
    {
        return a+b+c+d;
    }
}
