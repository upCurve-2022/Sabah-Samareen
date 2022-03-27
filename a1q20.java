import java.util.*;
import static java.lang.Math.pow;

public class a1q20 {
    public static void decimal(String m) {
        int i=0,sum=0;
        char c[]=m.toCharArray();
        for(int j=c.length-1;j>=0;j--){
            sum= (sum+(((int)c[j]-48)*(int)pow(2,i)));
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value");
        String m=sc.next();
        decimal(m);
    }
}

