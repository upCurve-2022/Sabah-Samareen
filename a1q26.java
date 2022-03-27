import java.util.*;
public class a1q26 {
    public static String reverse_string(String s) {
        String rs=new String();
        for(int i=s.length()-1;i>=0;i--){
            rs=rs+s.charAt(i);
        }
        return rs;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to be checked");
        String s=sc.next();
        if(s.equals(reverse_string(s)))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}
