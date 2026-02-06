package Feb_3_2026.Ex3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_ex {

    public static void main(String[] args){

        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(56);
        list.add(34);
        list.add(23);
        list.add(89);
        list.add(23);
        list.add(67);
        list.add(23);
        list.add(7,34);
        list.set(7,89);
        list.add(0,44);

        int min= list.get(0);
        int max=list.get(0);
        System.out.println(list);

        Iterator<Integer> it= list.iterator();

        while(it.hasNext())
        {
            int a= it.next();
            if(max< a)
            {
                max=a;
            }
            if(min>a)
            {
                min=a;
            }
        }
        System.out.println(min);
        System.out.println(max);

        System.out.println("Reverse order");
        List<Integer> list2= new ArrayList<>();

        for (int i = list.size()-1; i >=0 ; i--) {
            list2.add(list.get(i));

            }
        System.out.println(list2);

        System.out.println("Reversed using iterator : ");

        ListIterator it2= list.listIterator(list.size());

        while(it2.hasPrevious())
        {
            System.out.print(it2.previous()+" ");
        }

        //sum and avg of numbers
        System.out.println("\nThe sum of numbers:");
        int sum=0,avg=0;
        for(int num:list)
        {
            sum+=num;
        }
        System.out.println(sum);
        System.out.println("The average : "+(sum/list.size()));

        int even=0,odd=0;
        while (it2.hasNext())
        {
            int a=(int)it2.next();
            if(a%2==0)
            { even++;
            }else odd++;
        }
        System.out.println("No of odd numbers: "+odd);
        System.out.println("No of even numbers: "+even);


        }


    }

