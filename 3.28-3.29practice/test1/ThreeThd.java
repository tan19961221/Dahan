package s4;

public class ThreeThd implements Runnable {
    private static int count = 0;

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
