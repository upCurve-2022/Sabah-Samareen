import java.util.*;
public class a1q9 {
    public static void revno(int n){
        int num=n;
        while(num%10!=0){
            System.out.print(num%10);
            num=num/10;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value");
        int n=sc.nextInt();
        revno(n);
    }
}
