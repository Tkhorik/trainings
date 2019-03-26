package multithreading;

public class DeadLockSolutionExample {
    int WIDTH = 2;
    int HEIGHT = 2;

    public DeadLockSolutionExample(int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    public DeadLockSolutionExample() {
    }

    public static void main(String[] args) {

        for (int i = 0; i < WIDTH; i++) {
            for (int j = - HEIGHT; j < HEIGHT; j++) {
                draw("+");
            }
        }
    }

    private static void draw(String s) {
        System.out.println(s);


    }
}