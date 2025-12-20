public class Practise {
    public static void main(String[] args)
    {
        Phone phn= new Phone();
        phn.model="Samsung";
        phn.price=1500;
        Phone.name ="Smartphone";
        phn.Display();

        Phone phn2= new Phone();
        phn2.model="SD";
        phn2.price=1500;
        Phone.name ="Smartphone2";
        phn2.Display();

        phn.Display();

        Phone.name="123";
        phn.Display();
        phn2.Display();
        Phone.name="456";
        Phone.Display1(phn);
    }
}

class Phone {

    String model;
    int price;
    static String name;

    void Display()
    {
        System.out.println("Model: "+model+", Price: "+price+", Name: "+name+"\n");
    }
    static void Display1(Phone obj)
    {
        System.out.println("Model: "+obj.model+", Price: "+obj.price+", Name: "+name);
    }

}
