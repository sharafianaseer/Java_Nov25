package List_Ex.MapEx;

import java.util.*;

public class Demo {
    public static void main(String[] args){
      Map<Integer,String> mp1= new HashMap<>(5,.5f );
      mp1.put(101,"AB");
      mp1.put(102,"CD");
      mp1.put(103,"EF");
      mp1.put(104,"GH");
      mp1.put(105,"IJ");
      mp1.put(106,"KL");
      mp1.put(106,"MN");

        System.out.println(mp1);
        Set<Integer> keys = mp1.keySet();
        Collection<String> values = mp1.values();
        System.out.println(mp1.keySet());
        System.out.println(mp1.values());

        System.out.println(mp1.entrySet());

        System.out.println("Contains :"+mp1.containsKey(101));
        System.out.println("Contains : "+mp1.containsValue("MN"));

        System.out.println(mp1.get(101));
        System.out.println(mp1.getOrDefault(110,"No key found"));
        System.out.println(mp1.putIfAbsent(110,"FG"));
        System.out.println(mp1.entrySet());

        for(Map.Entry<Integer,String> entry: mp1.entrySet())
        {
            System.out.println(entry.getKey());
        }

    }

}
