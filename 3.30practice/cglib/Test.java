import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        List<String> proxy =(List<String>) Proxy.newProxyInstance(
                list.getClass().getClassLoader(),
                list.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return method.invoke(list,args);
                    }
                });
        proxy.add("你好");
        String ss = proxy.get(0);
        System.out.println(list);
        System.out.println(ss);

    }
}
