import java.util.*;
public class a1q7 {
    public static void max12(int a, int b, int c){
        if(c>a && c>b)
            System.out.println(c+" is the largest"+Math.max(a,b)+" is the 2nd largest");
        else if(b>a && b>c)
            System.out.println(b+" is the largest"+Math.max(a,c)+" is the 2nd largest");
        else if(a>b && a>c)
            System.out.println(a+" is the largest"+Math.max(c,b)+" is the 2nd largest");
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("enter 3 values");
        int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
        max12(a,b,c);
    }
}

