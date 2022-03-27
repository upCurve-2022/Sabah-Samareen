import java.util.*;
import static java.lang.Math.*;
public class a1q13 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of value");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.print((int) pow(i,i)+",");
        }
    }
}
