import java.util.*;
public class a1q14 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of values greater than3");
        int n= sc.nextInt();
        int a=1, b=4, c=7;
        System.out.print(a+","+b+","+c);
        for(int i=4;i<=n;i++){
            int sum=a+b+c;
            System.out.print(","+sum);
            a=b;
            b=c;
            c=sum;
        }
    }
}
