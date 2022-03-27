public class a4q1 {
    public static void main(String[] args)
    {
        String s1 = "abc";
        System.out.println("before modification");
        System.out.println(s1);
        s1.concat("def");
        System.out.println("after modification");
        System.out.println(s1);
    }
}
