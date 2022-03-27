import java.util.Scanner;

import static java.lang.Character.isDigit;

public class a4q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine(),s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-' && isDigit(s.charAt(i-1)) && isDigit(s.charAt(i+1)))
                continue;
            else
                s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}
