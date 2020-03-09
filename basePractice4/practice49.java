//  有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
import java.util.Scanner;

class practice49 {

    public static void main(String[] args) {
        int[] a = new int[30], b = new int[10];
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * 10);
                System.out.print(a[i] + ",");
            }
            for (int i = 0; i < a.length; i++) {
                b[a[i]]++;
            }
            System.out.println();
            for (int i = 0; i < b.length; i++) {
                System.out.println(i + "出现了" + b[i] + "次");
            }
        }
}