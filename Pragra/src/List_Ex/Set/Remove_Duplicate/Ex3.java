package List_Ex.Set.Remove_Duplicate;

import java.util.*;

public class Ex3 {
    public static void main(String[] args){

        List<Employee> emp= new ArrayList<>();
        emp.add(new Employee("Sharafia","sharafia@gmail.com",234567));
        emp.add(new Employee("Sharafia","sharafia@gmail.com",234567));
        emp.add(new Employee("Asraa","asraa@gmail.com",234567));
        emp.add(new Employee("Hari","hari@gmail.com",234567));
        emp.add(new Employee("Sharafia","sharafia@gmail.com",234567));
        emp.add(new Employee("Shikha","Shikha@gmail.com",234567));
        emp.add(new Employee("Hari","hari@gmail.com",234567));

        Set<Employee> set1= new LinkedHashSet<>();
        set1.addAll(emp);
        for(Employee e : set1) {
            System.out.println(e);
        }
    }
}
