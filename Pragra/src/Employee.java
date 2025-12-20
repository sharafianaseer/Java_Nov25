public class Employee {

    byte empId;
    String name;
    String department;
    int salary;

    void EmployeeDetails()
    {
        System.out.println("The name of the employee is "+name);
        System.out.println("Employee ID is "+empId);
        System.out.println("Working in "+department+" department, with salary of amount $"+salary+"\n");
    }


}
