package s10;

import java.util.LinkedList;

public class Test3 {
    private LinkedList<Object> linkedList;

    public Test3() {
        linkedList = new LinkedList<Object>();
    }

    public void put(Object object) {
        linkedList.add(object);
    }

    public Object get() {
        Object object = null;
        if (linkedList.size() != 0) {
            object = linkedList.get(0);
            linkedList.remove(0);
        }
        return object;
    }

    public boolean isEmpty() {
        if (linkedList.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.put("1");
        test3.put("2");
        System.out.println(test3.get());
        System.out.println(test3.get());
        System.out.println(test3.isEmpty());
    }
}
