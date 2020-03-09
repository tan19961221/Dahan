//从键盘输入一个班5个学生的分数，求和并输出

import java.util.*;

class practice31 {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入五个数：");
        Scanner in = new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++) {
            a[i] = in.nextInt();
        }
        System.out.println("他们的和：");
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}