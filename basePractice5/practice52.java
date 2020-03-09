//2.数据加密问题

import java.util.Scanner;

class practice52 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = 0;
        int b = 0;
        do {
            System.out.print("请输入一个8位正整数：");
            num = x.nextInt();
        } while (num < 10000000 || num > 99999999);
        int a[] = new int[8];
        a[0] =  num / 10000000;
        a[1] = (num / 1000000) % 10;
        a[2] = (num / 100000) % 10;
        a[3] = (num / 10000) % 10;
        a[4] = (num / 1000) % 10;
        a[5] = (num / 100) % 10;
        a[6] = (num / 10) % 10;
        a[7] = num % 10;
        for (int j = 0; j < 8; j++) {
            a[j] += 5;
            a[j] %= 10;
        }
        for (int j = 0; j <= 3; j++) {
            b = a[j];
            a[j] = a[7 - j];
            a[7 - j] = b;
        }
        b = a[7];
        a[7] = a[0];
        a[0] = b;
        System.out.print("加密后的数字为：");
        for (int j = 0; j < 8; j++)
            System.out.print(a[j]);
    }
}