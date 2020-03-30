package s10;

import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Person other = (Person) obj;
        return other.name.equals(this.name);
    }
}

public class Test1 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person("张三", 25);
        Person p2 = new Person("李四", 23);
        Person p3 = new Person("张三", 27);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        for (Object obj : hashSet) {
            Person p = (Person) obj;
            System.out.println(p.name + ":" + p.age);
        }
    }
}