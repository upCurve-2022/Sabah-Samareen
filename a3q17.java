import java.sql.Struct;
import java.util.Scanner;

public class a3q17 {
    public static class Node{
        int value;
        Node left, right;
        Node(int value){
            this.value=value;
            left=null;
            right=null;
        }
    }
    public static Node root=null;
    public static void insert(Node x, int value){
        Node n= new Node(value);
        if(root==null) {
            root = n;
            return;
        }
        if(value<x.value){
            if(x.left==null){
                x.left=n;
                return;
            }
            insert(x.left,value);
        }
        else if (value>x.value){
            if(x.right==null){
                x.right=n;
                return;
            }
            insert(x.right,value);
        }
        else if(value==x.value)
            return;
    }
    public static void leaf_nodes(Node x) {
        if(x==null)
            return;
        if(x.left==null && x.right==null) {
            System.out.println(x.value);
            return;
        }
        else {
            leaf_nodes(x.left);
            leaf_nodes(x.right);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of values to be added to binary tree");
        int n= sc.nextInt();
        System.out.println("enter the values");
        for(int i=0;i<n;i++){
            insert(root,sc.nextInt());
        }
        leaf_nodes(root);
    }
}
