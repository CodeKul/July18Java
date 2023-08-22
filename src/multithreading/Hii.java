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

//new - where you create object of thread and before invocation of start
//runnable  - after start method invoke but thread scheduler is not selected as running thread
//running - after thread scheduler select as running thread
//blocked/waiting -  it is not in running state but still alive
//death - after run method execution completed