public class EmployeeMain {

    public static void main(String[] args)
    {
        Employee emp1=new Employee();
        emp1.name="Sharafia Naseer";
        emp1.empId=23;
        emp1.department="HR";
        emp1.salary=50_000;
        emp1.EmployeeDetails();

        Employee emp2=new Employee();
        emp2.name="Harry Potter";
        emp2.empId=56;
        emp2.department="Finance";
        emp2.salary=95_000;
        emp2.EmployeeDetails();

        Employee emp3=new Employee();
        emp3.name="Jason Smith";
        emp3.empId=34;
        emp3.department="Accounting";
        emp3.salary=100_000;
        emp3.EmployeeDetails();

    }
}
