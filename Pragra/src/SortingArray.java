public class SortingArray {

 public static void main(String[] args){

     int[] array = {10,2,33,42,69,37,1,38};
     int min=array[0];
     int max=array[0];
     int sum=0;
     for (int j : array) {
         if (min > j)
             min = j;
     }
     System.out.println("The min value is "+min);

     for (int j : array) {
         if (max < j)
             max = j;
     }
     System.out.println("The max value is "+max);

     for (int a:array)
     {
         sum+=a;
     }
     System.out.println("The sum is "+sum);

     System.out.print("Even numbers are ");
     for(int a:array)
     {
         if (a%2==0)
             System.out.print(a+" ");
     }

     System.out.print("\nOdd numbers are ");
     for(int a:array)
     {
         if(a%2!=0)
             System.out.print(a+" ");
     }

     int temp=0;
     for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array.length - 1; j++) {
             if (array[i] > array[j]) {
                 temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
             }

         }
     }
     System.out.print("\nDescending order :");
         for(int a:array)
         {
             System.out.print(a+" ");
         }
     for (int i = 0; i < array.length; i++)
     {
         for (int j = 0; j < array.length-1; j++)
         {
            if(array[i]<array[j])
            {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
         }

     }
     System.out.print("\nAscending order :");
     for(int a:array)
     {
         System.out.print(a+" ");
     }




     //min max value
     //sort in asc and desc
     //sum of elements
     //find even and odd
 }
}
