import java.util.Stack;
import java.util.Scanner;
public class a1q30 {
    static Stack<Integer> values = new Stack<Integer>();
    static Stack<Character> ops = new Stack<Character>();

    public static int evaluator(char op,int b,int a){

        if (op == '+') return (a + b);
        if (op == '-') return (a - b);
        if (op == '*') return (a * b);
        if (op == '/') return (a/b);
        return 0;
    }
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int exp_evalu8(String s){
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==' ')
                continue;
            else if (s.charAt(i) == '(')
                ops.push(s.charAt(i));
            else if(Character.isDigit(s.charAt(i))) {
                int val = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    val = (val * 10) + (int) s.charAt(i) - 48;
                    i += 1;
                }
                i--;
                values.push(val);
            }
            else if (s.charAt(i) == ')') {
                while (ops.peek() != '(') {
                    values.push(evaluator(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop();
            }
            else if (s.charAt(i) == '+' || s.charAt(i)== '-' || s.charAt(i)== '*' || s.charAt(i) == '/')
            {
                while (!ops.empty() && hasPrecedence(s.charAt(i),ops.peek()))
                    values.push(evaluator(ops.pop(), values.pop(), values.pop()));
                ops.push(s.charAt(i));
            }
        }
        while(!ops.empty())
            values.push(evaluator(ops.pop(), values.pop(), values.pop()));
        return values.pop();
    }

    public static void main(String[] args) {
        System.out.println("enter the expression");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(exp_evalu8(s));
    }

}