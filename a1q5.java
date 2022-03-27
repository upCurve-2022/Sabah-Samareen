import java.sql.SQLOutput;
import java.util.*;
public class a1q5 {
    public static boolean oddoreven(int a){
        if (a%2==0)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number to be evaluated");
        int a=s.nextInt();
        boolean h=oddoreven(a);
        if (h==true)
            System.out.println(a+" is even");
        else
            System.out.println(a+" is odd");
    }
}
