import java.util.Scanner;

public class a3q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter year to be checked");
        int year=sc.nextInt();
        if(year%4==0)
            System.out.println("it is a leap year");
        else
            System.out.println("it isn't a leap year");
    }
}
