package Jan24.ContainerExamples;

public class Container<Student,Course> {

    Student student;
    Course course;



    @Override
    public String toString() {
        return "Container{" +
                "student=" + student +
                ", course=" + course +
                '}';
    }

    public void add(Student student, Course course)
    {
        this.student=student;
        this.course=course;
    }
}
