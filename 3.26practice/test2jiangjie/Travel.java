package s2;

//现在有一个旅行队10个人,探险进入一线天,这个一线天每次只能过一个人,每个人过的时间是20秒,现在10个人通过该一线天,请输出每个人经过一线天的顺序和姓名
public class Travel implements Runnable {
    private int i = 10;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (i > 0) {
                    System.out.println(Thread.currentThread().getName()+"----" + i--);
                    Thread.currentThread().stop();
                } else {
                    break;
                }
            }
        }
    }
}