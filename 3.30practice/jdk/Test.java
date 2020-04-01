package JdkAdd;
//张三租房子，新增租完房子房东给他打扫。
import java.lang.reflect.Proxy;

public class Test {
    public void testProxy() {
        ZuFangImp zuFangImp = new ZuFangImp();
        ZuFang zuFang = (ZuFang) Proxy.newProxyInstance(ZuFang.class.getClassLoader(), new Class[]{ZuFang.class}, new ProxyHand(zuFangImp));
        zuFang.zuFangzi("张三");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.testProxy();
    }
}


