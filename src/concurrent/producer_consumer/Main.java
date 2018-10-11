package concurrent.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 谢仲东 2018-08-15 14:08
 */
public class Main {

    public static void main(String[] args) {

        ArrayBlockingQueue<Data> cache = new ArrayBlockingQueue<>(5);
        Producer p = new Producer(cache);
        Consumer c = new Consumer(cache);

        ExecutorService pool = Executors.newCachedThreadPool();
        for (int a = 0; a < 10; a++) {
            pool.submit(p);
        }
        for (int a = 0; a < 10; a++) {
            pool.submit(c);
        }

        pool.shutdown();
    }
}
