import java.util.*;
import static java.lang.Math.*;
public class a1q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of values");
        int n=sc.nextInt(),a=1;
        System.out.print(a+",");
        for(int i=1;i<n;i++){
            a = (int)(a + pow(i,2));
            System.out.print((int)(a*pow(-1,i))+",");
        }
    }
}
