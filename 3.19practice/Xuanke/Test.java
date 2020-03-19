package Xuanke;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Course> courses = new HashSet<>();
        courses.add(new Course(9527,"java基础"));
        courses.add(new Course(9568,"C#"));
        courses.add(new Course(9898,"javaScript"));
        Student s1 = new Student(1,"张三",courses);
        System.out.println(s1);
    }
}
