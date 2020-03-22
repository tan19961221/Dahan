package s15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student("stu" + i, i + 1, i + 1));
        }
        List<Question> questions = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            questions.add(new Question(j + 1, "题目" + j + 1, "A", "B", "C", "D", "A"));
        }
        int quit = 0;
        double score = 0;
        int x = 0;
        System.out.println("请输入你的名字：");
        Scanner scr = new Scanner(System.in);
        while (quit == 0) {
            String name = scr.next();
            for (int a = 0; a < students.size(); a++) {
                if (students.get(a).getStuName().equals(name)) {
                    x = a;
                    quit = 1;
                } else {
                    System.out.println("请重新输入名字：");
                }
            }
        }
        System.out.println("请输入密码：");
        int quit2 = 0;
        while (quit2 == 0) {
            int miMa = scr.nextInt();
            if (students.get(x).getStuPwd() == miMa) {
                quit2 = 1;
            } else {
                System.out.println("密码错误，重新输入：");
            }
        }
        System.out.println("密码正确，开始考试");
        for (int b = 0; b < questions.size(); b++) {
            System.out.println(questions.get(b).toString());
            System.out.println("请选择答案：");
            String ans = scr.next();
            if (questions.get(b).getAnswer().equals(ans)) {
                score += 10;
            }
            students.get(x).setStuScore(score);
            System.out.println(students.get(x).toString());
        }
    }
}
