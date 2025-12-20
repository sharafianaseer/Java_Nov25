import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
       // String message = "Hello ";
        //String name = "Sharafia";

        //System.out.println(name.replace("a","e "));
       // System.out.println(name);

        //int[][] numbers= {{2,4,6},{4,8,2}};
        //numbers[0][0]=1;
        //System.out.println(Arrays.deepToString(numbers));
        // double x= 1.1;
        // short y = (short) (x+2);
       // System.out.println(y);

       // String x="2.1";
        //int y = (int) (Float.parseFloat(x) + 3);
        //System.out.println(y);

       // double y= (Math.random()*100);
        //System.out.println(y);
        String number = "327385489.08865";
       String currency = NumberFormat.getCurrencyInstance().format(Double.parseDouble(number));
        System.out.println(currency);

        String number21= ".234";
       /* NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMinimumFractionDigits(1);
        String percent= NumberFormat.getPercentInstance().format(Float.parseFloat(number21));
        System.out.println(percent);*/

        NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.CANADA);
        percentFormat.setMinimumFractionDigits(2);  // Force one decimal place

        String percent = percentFormat.format(Float.parseFloat(number21));
        System.out.println(percent);
    }
}
