import java.util.Scanner;

public class a3q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings");
        String s1 =sc.nextLine(), s2=sc.nextLine();
        is_string1_in_string2(s1,s2);
    }

    private static void is_string1_in_string2(String s1,String s2) {
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(0)==s2.charAt(i)) {
                for (int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(j) != s2.charAt(i + j))
                        break;
                    if (j == (s1.length() - 1) && s1.charAt(j) == s2.charAt(i + j)) {
                        System.out.println("string 1 is at position " + (i + 1) + " in string 2");
                        return;
                    }
                }
            }
        }
        System.out.println("string 1 isn't present in string 2");
        return;
    }
}
