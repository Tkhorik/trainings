package multithreading;

public class MultithreadingBeginning {
    public static void main(String[] args) {
        MyClass myThread = new MyClass();
        myThread.start();
        System.out.println("hello word");
        MyClass myThread2 = new MyClass();
        myThread2.start();
    }
}

class MyClass extends Thread {
    final int dimension = 100;

    @Override
    public void run() {
        for (int i = 0; i < dimension; i++) {
            System.out.println("hello from my thread " + i);
        }
    }
}
