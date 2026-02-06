package Jan27_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args){

        List<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(56);
        arr.add(45);
        arr.add(1,34);
        System.out.println(arr);

        ArrayList arr2= new ArrayList();
        arr2.add(34);
        arr2.add("sharafia");
        System.out.println(arr2);


    }
}
