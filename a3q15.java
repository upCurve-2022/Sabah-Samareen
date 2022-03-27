import java.util.Scanner;

public class a3q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.next();
        permut8(s,0);

    }
    public static void permut8(String s, int n) {
        String str="";
        if (n==(s.length()-1)) {
            System.out.println(s);
            return;
        }
        for(int i=n;i<s.length();i++){
            str=swap(s,i,n);
            permut8(str,n+1);
            str=swap(s,i,n);
        }
        return;
    }

    private static String swap(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

}
