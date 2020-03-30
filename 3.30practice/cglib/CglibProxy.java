package s7;
/*JDK动态代理是利用反射机制生成一个实现代理接口的匿名类
JDK代理是不需要以来第三方的库，只要要JDK环境就可以进行代理
cglib动态代理是利用asm开源包，对代理对象类的class文件加载进来
CGLib 必须依赖于CGLib的类库
cglib比JDK快*/

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Object target;

    @Override
    public Object intercept(Object obj, Method method, Object[] arr, MethodProxy proxy) throws Throwable {
        Object invoke = method.invoke(target, arr);
        return invoke;
    }

    public Object getCglibProxy(Object objectTarget) {
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(objectTarget.getClass());
        enhancer.setCallback(this);
        Object result = enhancer.create();
        return result;
    }

    public static void main(String[] args) {
        CglibProxy cglib = new CglibProxy();
        UserManager user = (UserManager) cglib.getCglibProxy(new UserManagerImpl());
        user.delUser("概论");
    }

}
