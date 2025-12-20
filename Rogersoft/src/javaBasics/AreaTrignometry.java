package javaBasics;
public class AreaTrignometry {

    public static void main (String[] args)
    {
        int  radius = 5, breadth= 7, height =8;
        double pie = Math.PI;
        float AOC = (float) (pie*radius*radius);
        float AOT= (float)(.5*breadth*height);
        System.out.println("Area of circle= "+AOC);
        System.out.println("Area of triangle= "+AOT);
        System.out.println("Area of square= "+breadth*height);
        System.out.println("Perimeter of pentagon= "+5*radius);

    }
}
