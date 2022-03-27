import java.util.Scanner;

public class a3q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        System.out.println("enter array elements");
        int arr[]=new int[size],sum=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("the average is "+(sum/size));
    }
}
