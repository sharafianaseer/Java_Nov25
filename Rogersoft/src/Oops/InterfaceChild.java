package Oops;

public interface InterfaceChild implements InterfaceExample{
    {
    public static void main(String[] args)
        {
            interfaceChild obj = new InterfaceChild();
            System.out.println(obj.add());
        }

        public int add()
        {
            int a = 0,b=0;
            int i = a + b;
            return i;
        }

        public boolean Compare()
        {
            String a= "Hello";
            String b="Goodmorning";
        }

    }
}
