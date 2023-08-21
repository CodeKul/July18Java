package multithreading;

public class Hii extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i=0;i<5;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Hello implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Test{

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Hii hii = new Hii();
        hii.start();
        hii.setPriority(1);

        Hello hello = new Hello();
        Thread t1=  new Thread(hello);
        t1.start();
        t1.setPriority(10);
    }
}