package concurrent.producer_consumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author 谢仲东 2018-08-15 12:03
 */
public class Consumer implements Runnable{

    private ArrayBlockingQueue<Data> queue;

    private final Random R = new Random();

    public Consumer(ArrayBlockingQueue<Data> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000 + R.nextInt(8000));
            Data data = queue.take();
            System.out.println("消费:" + data.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
