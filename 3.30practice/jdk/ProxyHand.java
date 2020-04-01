package JdkAdd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHand implements InvocationHandler {
    private Object person;

    public ProxyHand(Object person){
        this.person=person;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj=method.invoke(person,args);
        fangdong();
        return obj;
    }
    public int fangdong(){
        System.out.println("房东很高兴！帮你打扫了房子。");
        return 0;
    }
}
