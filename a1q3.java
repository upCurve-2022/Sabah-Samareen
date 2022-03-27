import java.util.*;
public class a1q3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal,rate of interest and time period");
        int prncpl=sc.nextInt(),rate=sc.nextInt(),t=sc.nextInt();
        int amount=(prncpl*rate*t)/100;
        System.out.println("the simple interest is "+amount);
    }
}
