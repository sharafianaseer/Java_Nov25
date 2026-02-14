package List_Ex.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex1   {

    public static void main(String[] args){

        Set<Integer> list1 = new TreeSet<>( );
        list1.add(23);
        list1.add(67);
        list1.add(89);
        list1.add(25);
        list1.add(97);
        list1.add(45);
        list1.add(97);
        System.out.println(list1);

        Set<Integer> list2 = new HashSet<>();
        list2.add(56);
        list2.add(47);
        list2.add(89);
        list2.add(23);
        list2.add(59);
        list2.add(39);

        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);


    }
}
