import java.util.*;
public class a1q10 {
    public static void nonames(String n){
        char s1[]= n.toCharArray();
        String names[]= new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i =0;i<s1.length;i++) {
            System.out.print(names[(int) s1[i]-48] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value");
        String n=sc.next();
        nonames(n);
    }
}

