import java.util.*;
public class a1q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of values");
        int n=sc.nextInt(),a=1,b=1,c=0;
        System.out.print(a+","+b);
        for(int i=1;i<n-1;i++){
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
    }
}
