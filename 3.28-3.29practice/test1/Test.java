package s4;
//1.现在有三个线程,如何保持三个线程按照顺序执行

public class Test {
    public static void main(String[] args) throws InterruptedException {

        ThreeThd threeThd = new ThreeThd();

        Thread thread1 = new Thread(threeThd, "A");
        Thread thread2 = new Thread(threeThd, "B");
        Thread thread3 = new Thread(threeThd, "C");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }

}
