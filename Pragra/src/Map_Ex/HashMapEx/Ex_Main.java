package Map_Ex.HashMapEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex_Main {

    public static void main(String[] args){

        Map<String,Integer> hash1 = new HashMap<>();
        hash1.put("Sharafia",98);
        hash1.put("Haripriya",99);
        hash1.put("Asraa",65);
        hash1.put("Shikha",78);
        hash1.put(null,34);

        System.out.println(hash1.entrySet());

       int max= hash1.values().iterator().next();
       String std=hash1.keySet().iterator().next();

       for(Map.Entry<String,Integer> entry: hash1.entrySet())
       {
           if(max<entry.getValue())
           {
               max= entry.getValue();
               std= entry.getKey();
           }
       }
        System.out.println("Highest marks : "+max+" given to student : "+std);


    }
}
