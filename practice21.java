//手动输入任意三个数，求三个数的和，差

import java.util.*;

class practice21 {
    public static void main(String[] args) {
        System.out.println("输入一个数:");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        String a =x%2==0?"偶数":"奇数";
        System.out.println(a);
    }
}
