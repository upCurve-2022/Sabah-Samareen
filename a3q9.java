import java.io.FileOutputStream;
import java.io.IOException;
public class a3q9 {
    public static void main(String[] args) {
        String s="writing into this file";
        try{
            FileOutputStream f=new FileOutputStream("sabah.txt"); //file object initialized
            byte a[]=s.getBytes();
            f.write(a);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
