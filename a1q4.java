import java.sql.Array;
import java.util.*;
public class a1q4 {
    public static void swap2(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void swap3(int a, int b, int c){
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println("c="+a);
        System.out.println("d="+b);
        System.out.println("e="+c);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers to be swapped");
        System.out.println("a=");
        int a=sc.nextInt();
        System.out.println("b=");
        int b=sc.nextInt();
        swap2(a,b);
        System.out.println("enter 3 numbers to be swapped");
        System.out.println("c=");
        int c=sc.nextInt();
        System.out.println("d=");
        int d=sc.nextInt();
        System.out.println("e=");
        int e=sc.nextInt();
        swap3(c,d,e);
    }

}
