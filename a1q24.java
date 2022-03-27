import java.util.*;
public class a1q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of base and power");
        int X=sc.nextInt(),n=sc.nextInt(),value=0;
        for(int i=1;i<=n;i++)
            value=X*X;
        System.out.println(value);
    }
}
