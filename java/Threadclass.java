public class Threadclass extends Thread{
    public static String s,y;

    public Threadclass(String name){
        this.s=name;
        start();
    }
    @Override
    public void run() {
        try {
            Takeorder to = new Takeorder();
            int z = to.order(this.s);
            Prep p = new Prep();
            try {
                y=p.prepn(z,s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Del d = new Del();
            d.del(z, y);
        }catch(Exception e){
            System.out.println(e.fillInStackTrace());
        }
        interrupt();
    }
}
