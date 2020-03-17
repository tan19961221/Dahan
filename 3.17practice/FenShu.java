package s11;

import java.util.Scanner;

public class FenShu {
    public static void main(String[] args) throws MyException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score=scanner.nextInt();
        checkScore(score);
    }

    public static void checkScore(int score) throws MyException {
        if (score < 0 || score > 100) {
            throw new MyException("分数必须在0—100之间");
        } else {
            System.out.println("成绩为："+score);
        }
    }
}
