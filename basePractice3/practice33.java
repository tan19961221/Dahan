//3.输入一批整数，使用循环求出最大值与最小值，输入0时结束。

import java.util.*;

class practice33 {

    public static void main(String[] args) {
        int max = 0,min = 0,num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        num = sc.nextInt();
        max = num;
        min = num;
        for (int i = 2; i > 0; i++) {
            System.out.println("请输入第"+i+"个数");
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num>max) {
                max = num;
            }else if (num<min){
                min = num;
            }else {
                System.out.println("这个数即不是最大值也不是最小值"+num);
            }
            System.out.println("最大值"+max+"最小值"+min);

        }
        System.out.println("结束循环");
    }
}