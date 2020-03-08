//手动输入任意三个数，求三个数的和，差

import java.util.*;

class practice11 {
    public static void main(String[] args) {
        int sum = 0;
        int sub = 0;
        System.out.println("请输入三个数：");
        Scanner in = new Scanner(System.in);
        int[] a=new int[3];
        for(int i=0;i<a.length;i++) {
            a[i] = in.nextInt();
        }
        System.out.println("他们的和：");
        for (int i = 0; i < 3; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println("他们的差：");
        for (int j = 0; j < 2; j++) {
            sub = a[j] - a[j+1];
            System.out.println(sub);
        }
        System.out.println(a[0]-a[2]);
    }
}
