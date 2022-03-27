import java.math.BigDecimal;
import java.util.*;
public class a1q6 {
    public static void seper8(double a){
        BigDecimal bd= new BigDecimal(String.valueOf(a));
        int wholenumber=bd.intValue();
        BigDecimal fraction=bd.subtract(new BigDecimal(wholenumber));
        String s= fraction.toPlainString();
        System.out.println("the whole number is"+wholenumber);
        System.out.println("the fractional part is"+s.substring(2,s.length()));
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number to be evaluated");
        double a=s.nextDouble();
        seper8(a);
    }
}
