import java.util.Scanner;

public class a3q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings");
        String s1 =sc.next(),s2=sc.next();
        to_upper(s1,s2);
    }

    private static void to_upper(String s1,String s2) {
        String s3=s1+s2;
        System.out.println(s3);
    }
}
