import java.util.HashSet;
import java.util.Scanner;

public class a3q16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        duplicate_check(s);
    }

    private static void duplicate_check(String s){
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++)
            for(int j=i+1;j<s.length();j++)
                if(s.charAt(i)==s.charAt(j))
                    h.add(s.charAt(i));
        System.out.println(h);
    }
}
