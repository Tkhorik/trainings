package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreClass {
    public static void main(String[] args) throws InterruptedException {
        /*Semaphore realization*/
        Semaphore semaphore = new Semaphore(10); //add permits
        try {
            semaphore.acquire(10);  //acquire permit from all permits set
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release(10);  //release permit  // by default it releases one permit
        System.out.println(" /*Semaphore realization*/ " + semaphore.availablePermits());

        /*Semaphore in action*/
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        ConnectionSingleton connectionSingleton = ConnectionSingleton.getInstance();

        for (int i = 0; i < 100; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    try {
                        connectionSingleton.doWorkWithSemaphore();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}


//singleton
class ConnectionSingleton {
    private static ConnectionSingleton connectionSingleton = null;
    private int counter;
    Semaphore semaphore = new Semaphore(5);

    private ConnectionSingleton() {
    }

    public static ConnectionSingleton getInstance() {
        if (connectionSingleton == null) {
            connectionSingleton = new ConnectionSingleton();
        }
        return connectionSingleton;
    }


    public void doWorkWithSemaphore() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();  //! i should be in final block couse if exception happens on of the acquired partitions must be released.
        }
    }


    public void doWork() throws InterruptedException {
        synchronized (this) {
            counter++;
            System.out.println(counter);
        }
        Thread.sleep(5000);
        synchronized (this) {
            counter--;
            System.out.println(counter);

        }
    }
}
