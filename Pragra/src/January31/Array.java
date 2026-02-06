package January31;

public class Array {

    public static void main(String[] args){

        int[] arr1= {2, 4, 7, 9, 4, 1};
        int target =10;

        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {
                {
                    if(arr1[i]+arr1[j]==target)
                    {
                        System.out.println(i+" : "+j);
                    }
                }

            }

        }

    }
}
