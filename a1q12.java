import java.util.*;
import static java.lang.Math.*;
public class a1q12 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of values");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.print(i*(int) pow(-1,i)+",");
        }
    }
}
