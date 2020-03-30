package s10;

import java.util.*;

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String ele1 = (String) obj1;
        String ele2 = (String) obj2;
        return ele2.compareTo(ele1);
    }
}

public class Test2 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap(new MyComparator());
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        map.put("4", "六");
        map.put("5", "田七");
        for (Object key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}

