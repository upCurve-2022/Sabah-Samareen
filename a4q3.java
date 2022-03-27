import java.util.Scanner;

public class a4q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        isnum(c);
    }

    private static void isnum(char[] c) {
        for(char i:c){
            if(!Character.isDigit(i)){
                System.out.println("not a completely numeric array");
                return;
            }
        }
        System.out.println("a numeric array");
        return;
    }
}
