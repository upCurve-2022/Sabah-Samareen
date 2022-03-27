import java.util.*;
public class a1q16 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value");
        int N=sc.nextInt(),a=1,c=4;
        System.out.print(a+",");
        for(int i=1;i<N;i++){
            a=a+c;
            System.out.print(a+",");
            c=c+(((i+1)%2)*4)+4;
        }
    }
}

