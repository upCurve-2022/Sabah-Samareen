import java.io.*;
import java.io.IOException;
import java.util.*;
public class a3q10 {
    public static void main(String[] args) {
        FileInputStream f1;
        FileOutputStream f2;
        try {
            f1 = new FileInputStream("file1.txt");
            f2 = new FileOutputStream("file2.txt"); //file
            int n;
            while ((n = f1.read())!=-1) {
                f2.write(n);
            }
            f1.close();
            f2.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
