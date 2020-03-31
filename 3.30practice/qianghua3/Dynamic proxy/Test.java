package dongtai;

import java.lang.reflect.Proxy;

public class Test {
    public void testProxy() {

        WhiteDog whiteDog = new WhiteDog();
        Dog dog = (Dog) Proxy.newProxyInstance(Dog.class.getClassLoader(),
                new Class[]{Dog.class}, new ProxyHandler(whiteDog));
        dog.eat();


    }

    public static void main(String[] args) {
        Test t = new Test();
        t.testProxy();

    }
}
