import java.util.Scanner;

public class a3q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of pen");
        int price=sc.nextInt();
        discount(price);
    }

    private static void discount(int p) {
        int discount_amount= (int) (0.12*p);
        System.out.println("discount= "+discount_amount+"\ntotal after discount= "+(p-discount_amount));
    }
}
