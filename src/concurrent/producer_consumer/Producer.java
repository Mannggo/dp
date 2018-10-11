package concurrent.producer_consumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 谢仲东 2018-08-15 12:03
 */
public class Producer implements Runnable{

    private ArrayBlockingQueue<Data> queue;

    private final Random R = new Random();

    private AtomicInteger count = new AtomicInteger(0);

    public Producer(ArrayBlockingQueue<Data> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000 + R.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Data data = new Data();
        int id = count.addAndGet(1);
        data.setId(id);
        data.setName("data-" + Integer.toString(id));
        queue.add(data);
        System.out.println("生产:" + data.toString());
    }
}
