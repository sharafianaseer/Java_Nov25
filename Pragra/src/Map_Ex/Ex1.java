package Map_Ex;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

    public static void main(String[] args){

        Map<Student,Integer> std1= new HashMap<>();
        std1.put((new Student("Sharafia",12)),45);
        std1.put((new Student("Asraa",13)),49);
        std1.put((new Student("Shikha",14)),34);
        std1.put((new Student("Haripriya",15)),47);

        System.out.println(std1.entrySet());
        System.out.println(std1.get(new Student("Sharafia",12)));


    }
}
