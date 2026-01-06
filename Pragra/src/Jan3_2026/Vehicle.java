package Jan3_2026;

public class Vehicle {

    String name;
    byte id;
    String color;

    public Vehicle(String name,  byte id, String color)
    {
        this.name=name;
        this.id=id;
        this.color=color;
    }

     Vehicle() {

    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", color='" + color + '\'' +
                '}';
    }

    void moving(){
        System.out.println(name+" is moving");
    }

    void decelerating(){
        System.out.println(name+" is slowing");
    }

    void accelerating(){
        System.out.println(name + " is speeding up");
    }
}
