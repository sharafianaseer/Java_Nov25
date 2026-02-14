package List_Ex.Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(23);
        list1.add(434);
        list1.add(53);
        list1.add(6);
        list1.add(343);
        list1.add(534);
        list1.add(64);
        list1.add(43);
        list1.add(23);
        list1.add(53);

        System.out.println("Initial list : "+list1);

        Set<Integer> set1 = new LinkedHashSet<>(list1);

        System.out.println(set1);


    }
}
