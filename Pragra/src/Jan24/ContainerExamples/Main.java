package Jan24.ContainerExamples;

public class Main {

    public static void main(String[] args) {

        Container<Student, Course> students = new Container<>();

        Student s1 = new Student("Sharafia",23);
        Course c1= new Course("Maths");

        students.add(s1,c1);
        System.out.println(students);
    }
}
