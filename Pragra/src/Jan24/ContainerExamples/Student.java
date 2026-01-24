package Jan24.ContainerExamples;

public class Student {
    String name;
    int rollNo;

    Student(String name,int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }


}


