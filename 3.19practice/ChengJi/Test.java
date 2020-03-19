package ChengJi;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            students.add(new Student(i + 180201, "学生" + i + 1, (int) (50*Math.random()+50)));
        }
        students.sort(Student::compareTo);
        System.out.println(students);
    }
}
