import java.util.*;
public class a1q18 {
    public static void factorial(int n){
        int m=1;
        for(int i=2;i<=n;i++)
            m*=i;
        System.out.println(m);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value");
        int m=sc.nextInt();
        factorial(m);
    }
}

