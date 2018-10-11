package concurrent.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 谢仲东 2018-08-15 15:27
 */
public class Main {

    public static void main(String[] args) {

        ExecutorService a = Executors.newCachedThreadPool();
        ExecutorService b = Executors.newSingleThreadExecutor();
        ExecutorService c = Executors.newFixedThreadPool(2);
        ExecutorService d = Executors.newScheduledThreadPool(5);
        a.shutdown();
    }
}
