package s16;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        DAO<User> x = new DAO<User>();
        x.map = new HashMap<String, User>();
        x.save("a", new User(1, "张三"));
        x.save("b", new User(2, "李四"));
        x.save("c", new User(3, "王五"));
        x.save("d", new User(4, "赵六"));
        System.out.println(x.map);
        System.out.println(x.get("a"));
        x.update("a", new User(5, "小芳"));
        System.out.println(x.map);
        x.list();
        x.delete("a");
        x.list();
    }
}
