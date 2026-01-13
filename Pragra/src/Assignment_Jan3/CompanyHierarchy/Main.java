package Assignment_Jan3.CompanyHierarchy;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("A person");
        Employee e = new Employee("Harry");
        Manager m = new Manager("Mr.John");
        m.working();
    }
}
