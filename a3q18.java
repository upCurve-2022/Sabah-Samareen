import java.util.Scanner;

public class a3q18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 values");
        int a=sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
        System.out.println(c>(a>b?a:b)?c:(a>b?a:b));
    }
}
