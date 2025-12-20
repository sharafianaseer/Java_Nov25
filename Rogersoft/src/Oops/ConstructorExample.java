package Oops;

public class ConstructorExample {
    static int a=0;
    static int b=0;

    public static void main(String[] args)
    {
        ConstructorExample obj=new ConstructorExample();//non-argument constructor
        System.out.println(add());
        System.out.println(obj.sub());
        System.out.println(obj.div());
        ConstructorExample obj1=new ConstructorExample(6,87);
        System.out.println(add());

    }

    /*public ConstructorExample()
    {
        System.out.println("Hello");

    }*/
    public ConstructorExample()
    {
        this.a=10;
        this.b=5;
        //System.out.println(a+b);
    }
    public ConstructorExample(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public static int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
    public int div(){
        return a/b;
    }

}
