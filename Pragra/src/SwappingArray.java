public class SwappingArray {

    public static void main(String[] args)
    {
        int[] array ={1,2,3,4,5,6,7,8,9,10};
        int a= array.length/2;
        /*for (int i = 0; i < a; i++)
        {
                int b=0;
                b=array[i];
                array[i]=array[(array.length+i)];
                array[(array.length+i)]=b;
        }*/

        int start=0;
        int end=array.length-1;
        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end ]=temp;
            start++;
            end--;
        }

        for(int b: array)
        {
            System.out.println(b);
        }











    }
}
