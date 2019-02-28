package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingThreadPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 1000; i++) {
            executorService.submit(new Work(i));
        }

        executorService.shutdown();
    }
}


class Work implements Runnable {

    int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("worker " + id + " has completed");
        long after = System.currentTimeMillis();
    }
}

