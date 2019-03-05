package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {
    public static void main(String[] args) throws InterruptedException {
        WorkForReentrantLockClass workForReentrantLockClass = new WorkForReentrantLockClass();

        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        workForReentrantLockClass.firstTread();
                    }
                });


        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        workForReentrantLockClass.secondThread();
                    }
                });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        workForReentrantLockClass.showCounter();
    }
}


class WorkForReentrantLockClass {
    private int counter;

    private Lock lock = new ReentrantLock();

    private void incrimentCounter() {
        for (int i = 0; i < 10000; i++) {
            counter = i;
        }
    }


    public void firstTread() {
        lock.lock();
        incrimentCounter();
        lock.unlock();
    }

    public void secondThread() {
        lock.lock();
        incrimentCounter();
        lock.unlock();
    }

    public void showCounter() {
        System.out.println(counter);
    }
}

