import java.util.Scanner;

public class StudentMarks {
    int[] marks;

    float calculateAverage()
    {
       float average = 0;
       int total = 0;
       for(int m:marks)
       {
         total+=m;
       }
       average=(float)total/marks.length;
       return average;
    }

    void displayMarks()

    {
        for(int m: marks)
        {
            System.out.print(m+" ");
        }
    }
}

 class Marks{

    public static void main(String[] args)
    {
        StudentMarks std1= new StudentMarks();
        std1.marks= new int[10];
        System.out.println("Enter the marks of 10 students: ");
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            std1.marks[i]=scanner.nextInt();
        }
        System.out.println("Average of marks: "+std1.calculateAverage());
        std1.displayMarks();




    }
 }
