package s2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Travel travel = new Travel();
        Thread t1 = new Thread(travel, "游客1");
        t1.start();
    }
}
