package multithreading;

public class MultithreadingSynchronized {

    private int counter;

    public static void main(String[] args) throws InterruptedException {
        MultithreadingSynchronized threadsTesting = new MultithreadingSynchronized();
        threadsTesting.doWork();
    }

    void doWork() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    incrementValue();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    incrementValue();
                }
            }
        });
        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(counter);
    }

/*    private synchronized void incrementValue() {
        counter += 1;
    } */

    private void incrementValue() {
        synchronized (this) {
            counter += 1;
        }
    }
}
