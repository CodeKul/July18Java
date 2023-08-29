package multithreading;

public class YieldDemo extends Thread {
    @Override
    public void run() {
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Thread.yield();
        for(int i=1;i<5;i++){
            System.out.println("in run method");
        }
    }
    public static void main(String[] args) {
        YieldDemo obj = new YieldDemo();
        obj.start();
        for(int i=1;i<5;i++){
            System.out.println("in main method");
        }
    }
}
