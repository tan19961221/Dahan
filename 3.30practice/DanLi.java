package s9;

public class DanLi {
    // 无参构造器
    private DanLi(){

    }

    // 静态内部类
    private static class Innerclass{
        private static final DanLi SINGLETON = new DanLi();
    }

    public DanLi getInstance(){
        return Innerclass.SINGLETON;
    }

}
