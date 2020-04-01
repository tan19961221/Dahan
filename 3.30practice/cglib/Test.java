import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
 /*
      jdk 动态代理是利用反射机制生成一个实现代理接口的匿名类，在调用具体方法前调用InvokeHandler来处理。cglib 动态代理是利用asm开源包，对代理对象类的class文件加载进来，通过修改其字节码生成子类来处理。ams 自动存储管理 可以是直接通过字节码来修改class文件
      1、如果目标对象实现了接口，默认情况下会采用JDK的动态代理实现AOP
      2、如果目标对象实现了接口，可以强制使用cglib实现AOP
      3、如果目标对象没有实现了接口，必须采用cglib库，spring会自动在JDK动态代理和cglib之间转换
      4、JDK动态代理只能对实现了接口的类生成代理，而不能针对类
      5、CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法，因为是继承，所以该类或方法最好不要声明成final
     
     */
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
