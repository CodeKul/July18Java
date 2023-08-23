package multithreading;

public class WorkerThread{

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            int count=0;
            while (true){
                try {
                    count++;
                    System.out.println("In While loop"+count);
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    System.out.println("In finally"+count);
                }
            }
        });

        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Exit");
    }

}
