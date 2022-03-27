import java.util.*;
public class a1q25 {
    public static String reverse_string(String s) {
        String rs=new String();
        for(int i=s.length()-1;i>=0;i--){
            rs=rs+s.charAt(i);
        }
        return rs;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to be inverted");
        String s=sc.next();
        System.out.println(reverse_string(s));

    }
}
