public class Prep extends Thread{
    public String prepn(int a,String s) throws InterruptedException {
        switch(a) {
            case 1:
                sleep(2000);
                break;
            case 2:
                sleep(1800);
                ;
                break;
            case 3:
                sleep(1500);
                break;
            case 4:
                sleep(2100);
                break;
            case 5:
                sleep(2400);
                break;
        }
        return s;
    }
}
