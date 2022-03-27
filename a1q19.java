import java.util.*;
public class a1q19 {
    public static void binary(int m) {
        int rem,n=m;
        ArrayList <Integer>al=new ArrayList<>();
        while(n!=1){
            rem=n%2;
            n=n/2;
            al.add(rem);
        }
        al.add(1);
        for(int j=al.size()-1;j>=0;j--)
            System.out.print(al.get(j));
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value");
        int m=sc.nextInt();
        binary(m);
    }
}

