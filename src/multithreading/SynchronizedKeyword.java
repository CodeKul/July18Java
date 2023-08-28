package multithreading;

public class SynchronizedKeyword {
   static int num;
    public void increament(){
      synchronized (SynchronizedKeyword.class){
          num++;
      }
    }
    public static void main(String[] args) throws InterruptedException {

        SynchronizedKeyword obj = new SynchronizedKeyword();

        Thread t1 = new Thread(()->{
            for(int i=1;i<=1000;i++){
                obj.increament();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=1;i<=1000;i++){
                obj.increament();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(obj.num);
    }
}
