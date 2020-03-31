package s9;
/*
懒汉模式安全
 */
public class SafLazySingleton {

    private static SafLazySingleton instance;

    private SafLazySingleton(){}

    public static synchronized SafLazySingleton getInstance(){
        if(instance == null){
            instance = new SafLazySingleton();
        }
        return instance;
    }
}