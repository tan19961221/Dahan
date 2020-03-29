package s2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Travel travel = new Travel();
        Thread t1 = new Thread(travel, "游客1");
        Thread t2 = new Thread(travel, "游客2");
        Thread t3 = new Thread(travel, "游客3");
        Thread t4 = new Thread(travel, "游客4");
        Thread t5 = new Thread(travel, "游客5");
        Thread t6 = new Thread(travel, "游客6");
        Thread t7 = new Thread(travel, "游客7");
        Thread t8 = new Thread(travel, "游客8");
        Thread t9 = new Thread(travel, "游客9");
        Thread t10 = new Thread(travel, "游客10");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        //Thread t1 = new Thread(travel, "游客1");
        //t1.start();
    }
}
