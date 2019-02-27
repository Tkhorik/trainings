package multithreading;

public class MultithreadingVolatile {
    public static void main(String[] args) {
        MyClassForVolotileLession myThread = new MyClassForVolotileLession();
        myThread.start();
        System.out.println("hello word");
        myThread.sleepPlz(5000);
        System.out.println("shutting down");
        myThread.shutdownRunner();
    }
}

class MyClassForVolotileLession extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        int i = 1;

        while (running) {
            System.out.println("hello from my thread " + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void shutdownRunner() {
        running = false;
    }

    void sleepPlz(int sec) {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
