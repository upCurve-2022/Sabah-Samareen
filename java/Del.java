public class Del {
    public void del(int a,String s){
        switch(a){
            case 1:
                System.out.println("******************Order completed for "+s+" FarmHousePizza. Total=230. Prep time=20minutes******************\n");
                break;
            case 2:
                System.out.println("******************Order completed for "+s+" ChickenDynamitePizza. Total=340. Prep time=18minutes******************\n");
                break;
            case 3:
                System.out.println("******************Order completed for "+s+" MargheritaPizza. Total=270. Prep time=15minutes******************\n");
                break;
            case 4:
                System.out.println("******************Order completed for "+s+" PaneerPizza. Total=300. Prep time=21minutes******************\n");
                break;
            case 5:
                System.out.println("******************Order completed for "+s+" JalepenoAndOnionPizza. Total=280. Prep time=24minutes******************\n");
                break;
        }
    }
}
