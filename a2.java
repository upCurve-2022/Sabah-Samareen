import java.util.*;
public class a2 {
    static int non_deliverable_zip_codes[]=new int[]{123,456,789,112,345,325,324,465,435};
    public static void main(String[] args) throws No_delivery_exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter zip code to check validity");
        int zip_code=sc.nextInt();
        zipcode_checker(zip_code);
    }

    private static void zipcode_checker(int zc) throws No_delivery_exception {
        boolean b=zip_in_nd(zc);
        if(b){
            try{
                throw new No_delivery_exception();
            }catch (No_delivery_exception ne){ne.display_the_foll();}
        }
        else if(!b){
            System.out.println("Delivery available in your area!");
        }
    }

    private static boolean zip_in_nd(int zc) {
        for(int i=0;i<non_deliverable_zip_codes.length;i++)
            if(zc==non_deliverable_zip_codes[i])
                return true;
        return false;
    }
}
