import java.util.*;
public class a4q6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings ");
        String s1=sc.nextLine(), s2=sc.nextLine();
        System.out.println("checking using equals() " + s1.equals(s2));
        System.out.println("checking using '==' "+(s1==s2));
        System.out.println("checking using compareTo() "+s1.compareTo(s2));
        System.out.print("checking using hashcode ");
        if(s1.hashCode()==s2.hashCode())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
