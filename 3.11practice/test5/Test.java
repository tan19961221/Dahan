package test5;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("张三","男",20,"中国");
        System.out.println(person.toString());
        person.eat();

        Student student=new Student("李四","男",21,"中国","下水道大学",9527);
        System.out.println(student.toString());
        student.work();
        //其余测试如上
    }
}
