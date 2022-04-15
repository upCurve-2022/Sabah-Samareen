import java.util.ArrayList;
import java.util.List;

public class Mainclass {
    static List<String> customers= new ArrayList<String>();
    public static void main(String[] args) throws InterruptedException {
        customers.add("A");
        customers.add("B");
        customers.add("C");
        customers.add("D");
        customers.add("E");
        customers.add("F");
        Threadclass th3,th2,th1;
        for(int i=0;i<customers.size();i++){
            if(i%3==0) {
                th3=new Threadclass(customers.get(i)); //counter no 3
                th3.sleep(1000);
            }
            else if (i%2==0) {
                th2=new Threadclass(customers.get(i)); //counter no 2
                th2.sleep(1000);
            }
            else {
                th1=new Threadclass(customers.get(i)); //counter no 1
                th1.sleep(1000);
            }
        }

    }
}
