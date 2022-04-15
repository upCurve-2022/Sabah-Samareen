import java.util.Random;
import java.util.stream.IntStream;

public class Takeorder {
    public int order(String s){
        System.out.println("MENU\n" +
                "1. FarmHousePizza\n" +
                "2. ChickenDynamitePizza\n" +
                "3. MargheritaPizza\n" +
                "4. PaneerPizza\n" +
                "5. JalepenoAndOnionPizza\n");
        Random r=new Random();
        int a=r.nextInt(1,6);
        switch(a){
            case 1:
                System.out.println("Order placed for "+s+"\nFarmHousePizza\nprep time=20minutes\n");
                break;
            case 2:
                System.out.println("Order placed for "+s+"\nChickenDynamitePizza\nprep time=18minutes\n");
                break;
            case 3:
                System.out.println("Order placed for "+s+"\nMargheritaPizza\nprep time=15minutes\n");
                break;
            case 4:
                System.out.println("Order placed for "+s+"\nPaneerPizza\nprep time=21minutes\n");
                break;
            case 5:
                System.out.println("Order placed for "+s+"\nJalepenoAndOnionPizza\nprep time=24minutes\n");
                break;
            default:
                System.out.println("wrong value entered");
        }
        return a;
    }
}
