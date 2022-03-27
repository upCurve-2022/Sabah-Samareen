import java.math.BigDecimal;
import java.util.Scanner;
import static java.lang.Math.pow;
public class a3q5 {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to be checked");
        int a=sc.nextInt();
        int root= (int) pow(a,0.5);
        double root1= (double) pow(a,0.5);
        if(root1-root==0.0)
            System.out.println("it is a perfect square of "+root1);
        else
            System.out.println("it isn't a perfect square");
    }
}
