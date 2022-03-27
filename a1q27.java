import java.util.Scanner;
import static java.lang.Math.pow;
public class a1q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a 3 digit number");
        String s=sc.next();
        armstrong(s);
    }

    public static void armstrong(String s) {
        int sum=0;
        for(int i=0;i<3;i++)
            sum=sum+((int)pow(s.charAt(i)-48,3));
        if(s.equals(Integer.toString(sum)))
            System.out.println("armstrong number");
        else
            System.out.println("not an armstrong number");
    }
}
