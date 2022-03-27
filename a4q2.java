import java.util.Scanner;

public class a4q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter statement");
        String s=sc.nextLine(),s1="";
        System.out.println("enter character");
        String c=sc.next();
        for(int i=0;i<s.length();i++){
            if(c.charAt(0)==s.charAt(i))
                continue;
            else
                s1=s1+s.charAt(i);
        }
        System.out.println(s1);

    }
}
