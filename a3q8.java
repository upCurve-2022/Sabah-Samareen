import java.io.File;
import java.io.IOException;
public class a3q8 {
    public static void main(String[] args) {
        File f=new File("sabah"); //file object initialized
        try{
            boolean result=f.createNewFile();
            if (result)
                System.out.println("file created "+f.getCanonicalPath());
            else
                System.out.println("file already exists at "+f.getCanonicalPath());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
