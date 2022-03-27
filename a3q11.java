import java.util.Scanner;

public class a3q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s =sc.next();
        to_upper(s);
    }

    private static void to_upper(String s) {
        char us[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
                us[i]=(char)((int)s.charAt(i)-32);
            else
                us[i]=s.charAt(i);
        }
        String us1= String.valueOf(us);
        System.out.println(us);
    }
}
