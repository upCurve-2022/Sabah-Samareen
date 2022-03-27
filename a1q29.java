import java.util.*;
public class a1q29 {
    static int[] arr =new int[]{122,223,435,533,614,713,914};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value to be searched");
        int a=sc.nextInt(),pos=binary_search(a);
        if(pos!=-1)
            System.out.println("the value is at position "+pos);
        else if(pos==-1)
            System.out.println("value not found");
    }

    private static int binary_search(int a) {
        int first=0, last=arr.length-1, mid=0;
        while(first<last){
            mid=(first+last)/2;
            if (arr[mid]==a)
                return mid+1;
            else if (a>arr[mid])
                first=mid+1;
            else if (a<arr[mid])
                last=mid-1;
        }
        return -1;
    }
}
