import java.util.Scanner;

class Student{
    String name ="";
    byte age=0;
    byte marks=0;
}

public class jaggedArray {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        byte number=scanner.nextByte();
        Student[] s=new Student[number];
        for(int i=0;i<number;i++){
            System.out.print("Name : ");
            s[i]=new Student();
            s[i].name=scanner.next();
            System.out.print("Age : ");
            s[i].age=scanner.nextByte();
            System.out.print("Marks : ");
            s[i].marks=scanner.nextByte();
        }
        for(Student e:s){
            System.out.println(e.name+","+e.age+" has got "+e.marks+" marks");
        }





      /*  Student s1=new Student();
        s1.name="Rihaan";
        s1.age=10;
        s1.marks=
        Student s2=new Student();
        Student s3=new Student();*/




    }
}
