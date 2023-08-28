package multithreading;

public class ProducerConsumer {

    int num;

    boolean flag = true;

    public synchronized void getNum() {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get: "+num);
        flag = true;
        notify();
    }

    public synchronized void setNum(int num) {
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.num = num;
        System.out.println("Set: "+num);
        flag = false;
        notify();
    }
}

class Producer extends Thread{

    ProducerConsumer producerConsumer;
    public Producer(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
    }
    @Override
    public void run() {
        int i =0;
        while (true){
            producerConsumer.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer extends Thread{

    ProducerConsumer producerConsumer;
    public Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
    }
    @Override
    public void run() {
        while (true){
            producerConsumer.getNum();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Main{

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer p = new Producer(producerConsumer);
        p.start();

        Consumer consumer = new Consumer(producerConsumer);
        consumer.start();
    }
}