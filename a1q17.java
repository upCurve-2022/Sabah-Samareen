import java.util.*;
public class a1q17 {
    public static void prime(int n){
        for(int i=2;i<n;i++)
            if(n%i==0)
                return;
        System.out.print(n+",");
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter starting and ending values");
        int m=sc.nextInt(),n=sc.nextInt();
        for(int i=m;i<=n;i++){
            prime(i);
        }
    }
}
