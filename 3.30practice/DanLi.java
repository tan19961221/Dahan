package s9;

public class DanLi {
    private DanLi(){

    }
    private static class Innerclass{
        private static final DanLi SINGLETON = new DanLi();
    }

    public static DanLi getInstance(){
        return Innerclass.SINGLETON;
    }

}
class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(DanLi.getInstance().hashCode());
    }
}
class Test{
    public static void main(String[] args) {
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        myThread1.start();
        myThread2.start();
    }
}