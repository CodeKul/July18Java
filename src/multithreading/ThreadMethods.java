package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {
                System.out.println("in thread t1");
        });

        t1.setName("test");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());
        System.out.println(t1.isAlive());

        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t1.isDaemon());
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());

    }
}
