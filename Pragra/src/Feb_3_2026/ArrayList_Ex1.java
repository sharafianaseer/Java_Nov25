package Feb_3_2026;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_Ex1 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(56);
        list1.add(34);
        list1.add(23);
        list1.add(89);
        list1.add(23);
        list1.add(67);
        list1.add(23);
        list1.add(7,34);
        list1.set(7,89);
        list1.add(0,44);
        list1.remove(0);
        list1.clear();


        System.out.println(list1);

        HashSet<Integer> list2= new HashSet<>();
        list2.addAll(list1);

        System.out.println(list2);



    }
}

