public class Calculator {

    int sum(int a, int b)
    {
        return a+b;
    }

    int sub(int a, int b)
    {
        return a-b;
    }

    int mul(int a, int b)
    {
        return a*b;
    }

    double div(int a, int b)
    {
        return (double)a/b;
    }
}

class CalculatorMain{
    public static void main(String[] args)
    {
        int a=9, b=7;
        Calculator calc1= new Calculator();
        System.out.println("Addition: "+calc1.sum(a,b));
        System.out.println("Substraction: "+calc1.sub(a,b));
        System.out.println("Multiplication: "+calc1.mul(a,b));
        System.out.println("Division: "+calc1.div(a,b));


    }

        }
