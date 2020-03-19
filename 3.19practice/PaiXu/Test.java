package PaiXu;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Fruits> fruits = new TreeSet<>();
        fruits.add(new Fruits("pear"));
        fruits.add(new Fruits("grape"));
        fruits.add(new Fruits("banana"));
        fruits.add(new Fruits("apple"));
        System.out.println(fruits.first());
        System.out.println(fruits.last());
        System.out.println(fruits);
    }
}
