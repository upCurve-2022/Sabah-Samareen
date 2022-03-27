import java.util.*;
public class a1q2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of rows");
        int a=sc.nextInt();
        int start=(int)(2*a-1)/2;
        int stop=start,starordash=1;
        for(int i=0;i<a;i++){
            starordash=1;
            for(int j=0;j<2*a-1;j++){
                if(j>=start&&j<=stop){
                    if (starordash==1) {
                        starordash = 0;
                        System.out.print("*");
                    }
                    else {
                        starordash = 1;
                        System.out.print(" ");
                    }
                }
                else
                    System.out.print(" ");
            }
            System.out.println("\n");
            start--; stop++;
        }
    }
}
