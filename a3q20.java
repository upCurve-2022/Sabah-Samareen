import java.util.Scanner;

public class a3q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String s=sc.nextLine(),s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')
                s1=s1+"$";
            else
                s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}
