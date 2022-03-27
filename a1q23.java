import java.util.*;
public class a1q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of values");
        int n=sc.nextInt(),a=1,b=-2;
        System.out.print(a+","+b);
        for(int i=1;i<n-1;i++){
            if(i%2!=0){
                a+=3;
                System.out.print(","+a);
            }
            else{
                b+=-4;
                System.out.print(","+b);
            }
        }
    }
}
