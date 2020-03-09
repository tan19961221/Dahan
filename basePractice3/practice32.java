//从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。

import java.util.*;

class practice32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num2 =sc.nextInt();
        int num = num2;
        String str="";
        do{
            int div = num/2;
            int mod = num%2;
            str = mod + str;
            num = div;
        }while(num!=0);
        System.out.println(num2+"---->"+str);
    }
}