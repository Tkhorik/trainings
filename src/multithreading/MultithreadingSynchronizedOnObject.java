package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultithreadingSynchronizedOnObject {

    public static void main(String[] args) {
        new Worker().timeCounter();
    }
}


class Worker {
    private Random random = new Random();

    private Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> listOne = new ArrayList<>();
    List<Integer> listTwo = new ArrayList<>();


    public void addToLIst1() {
        synchronized(lock1){
        addToAnyList(listOne);
    }}

    public void addToLIst2() {
        synchronized (lock2){
        addToAnyList(listTwo);
    }}

    private void addToAnyList(List<Integer> listOne) {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            listOne.add(random.nextInt(100));
        }
    }

    void doWork() {
        addToLIst1();
        addToLIst2();
    }


    void timeCounter() {
        long before = System.currentTimeMillis();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println("time spent " + (after - before));
        System.out.println(listOne.size());
        System.out.println(listTwo.size());
    }
}

