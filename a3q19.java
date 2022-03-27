import java.util.*;
public class a3q19 {
    public static boolean is_prime(int value){
        for(int i=2;i<value;i++)
            if (value%i==0)
                return false;
        return true;
    }
    public static boolean factors(int value){
        for(int i=6;i<value;i++)
            if(value%i==0 && is_prime(i)==true)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value");
        int value=sc.nextInt();
        if(is_prime(value)&&value!=2&&value!=3&&value!=5&&value!=1)
            System.out.println("not an ugly number");
        else if(value==2||value==3||value==5||value==1||factors(value)==true)
            System.out.println("ugly number");
        else
            System.out.println("not an ugly number");

    }
}
