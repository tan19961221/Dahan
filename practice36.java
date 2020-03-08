//6.30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数import java.util.*;
import java.util.Scanner;

class practice36 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = 0;
        int b = sr.nextInt();
        for (int i = 0; i < 10; i++) {
            if (b == (int) (Math.random() * 29)) {
                a++;
            }
        }
        System.out.println(a);
    }
}