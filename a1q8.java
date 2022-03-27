import java.util.Scanner;

public class a1q8 {
    public static int oddsum(int n){
        int osum=0;
        for(int i=1;i<=n;i++)
            if(i%2!=0)
                osum+=i;
        return osum;
    }
    public static int evensum(int n){
        int esum=0;
        for(int i=1;i<=n;i++)
            if(i%2==0)
                esum+=i;
        return esum;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();
        int os=oddsum(n);
        int es=evensum(n);
        System.out.println("evensum= "+es+" oddsum= "+os);
    }
}
