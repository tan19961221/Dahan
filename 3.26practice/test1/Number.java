package s1;

public class Number implements Runnable{
    private int num = 200;

    @Override
    public void run() {
        while (true){
            synchronized (Number.class){
                if (num > 400){
                    break;
                }
                if(num % 2 == 1){
                    System.out.println(Thread.currentThread().getName()+"----"+num++);
                }else {
                    System.out.println(num++);
                }
            }
        }
    }
}
