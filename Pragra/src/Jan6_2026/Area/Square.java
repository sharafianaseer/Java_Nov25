package Jan6_2026.Area;

public class Square {

    double area(double side)
    {
        return side*side;
    }

    double area(double length, double breadth)
    {
        return length*breadth;
    }


    public static void main(String[] args){

        Square square = new Square();
        System.out.println(square.area(5));
        System.out.println(square.area(5, 4));

    }


}


