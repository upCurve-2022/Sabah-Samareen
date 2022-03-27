import java.util.Scanner;
public class a3q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius and height");
        int r=sc.nextInt(), h=sc.nextInt();
        System.out.println("area of cylinder= "+(3.14*r*r*h));
    }
}
