package Feb_3_2026.Ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainEmployee {

    public static void main(String[] args){

        List<Employee> list1= new ArrayList<>();
        list1.add(new Employee("Sharafia",1,2300));
        list1.add(new Employee("Asraa",2,2370));
        list1.add(new Employee("Sharafia",1,2300));
        list1.add(new Employee("Haripriya",3,2300));
        list1.add(new Employee("Shikha",4,1800));
        list1.add(new Employee("Sharafia",1,2300));

        System.out.println(list1);

        HashSet<Employee> list2= new HashSet<>();
        list2.addAll(list1);

        System.out.println(list2);

    }

}
