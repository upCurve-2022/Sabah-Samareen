import java.util.Scanner;

public class a3q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s =sc.nextLine();
        System.out.println("the number of words are "+number_of_words(s));
    }

    private static int number_of_words(String s) {
        int c=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '||s.charAt(i)=='\n'||s.charAt(i)=='\0')
                ++c;
        }
        return c;
    }
}
