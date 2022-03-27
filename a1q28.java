import java.util.*;
public class a1q28 {
    static int[] arr =new int[]{122,223,435,233,214,13,214};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value to be searched");
        int a=sc.nextInt(),pos=linear_search(a);
        if(pos!=-1)
            System.out.println("the value is at position "+pos);
        else if(pos==-1)
            System.out.println("value not found");
    }

    private static int linear_search(int a) {
        for (int i=0;i<arr.length;i++) {
            if (a == arr[i])
                return i + 1;
        }
        return -1;
    }
}
