package List_Ex.Ex1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args){

        List<Employee> list1= new ArrayList<>();

        list1.add(new Employee(1,"A","A@gmail.com",23000));
        list1.add(new Employee(2,"B","B@gmail.com",34000));
        list1.add(new Employee(3,"C","C@gmail.com",56000));
        list1.add(new Employee(4,"D","D@gmail.com",28000));
        list1.add(new Employee(5,"E","E@gmail.com",78000));
        list1.add(new Employee(6,"F","F@gmail.com",59000));

        System.out.println(list1);
        Employee max= list1.getFirst();
        for(Employee e:list1)
        {
            if(max.getSalary()<e.getSalary())
            {
                max=e;}
        }

        System.out.println("Employee with max salary : \n"+max);

    }
}
