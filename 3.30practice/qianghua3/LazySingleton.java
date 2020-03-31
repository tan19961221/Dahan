package s9;
/*
懒汉模式
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}