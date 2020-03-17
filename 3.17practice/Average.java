package s11;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("请输入需要求几个平均数：");
            int n = scanner.nextInt();
            int quit=0;
            while(quit==0){
                try {
                    if (n < 0) {
                        throw new IllegalArgumentException();
                    }
                } catch (Exception e) {
                    System.out.println("输入的数必须是大于0的整数,请重新输入");
                    int m=scanner.nextInt();
                    n=m;
                    if(n>0){
                        quit=1;
                    }
                }
            }
            System.out.println("你需要输入" + n + "个数：");
            int a;
            double sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("请输入第" + (i + 1) + "个数：");
                try {
                    a = scanner.nextInt();
                    if (a < 0) {
                        throw new IllegalArgumentException();
                    }
                    sum += a;
                } catch (Exception e) {
                    System.out.println("输入的数必须是正整数或者0,请重新输入该数");
                    i -= 1;
                }
            }
            System.out.println("平均数是：" + sum / n);
    }
}
