package s11;

import java.util.Scanner;

public class SanJiaoXing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个边长：");
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int c = scanner.nextInt();
        isTriangle(a, b, c);
    }
    public static void isTriangle(int a,int b,int c) {
        try {
            if((a+b)>c && (a+c)>b && (b+c)>a) {
                System.out.println("三边长为："+a+","+b+","+c);
            }else {
                throw new IllegalArgumentException("a,b,c不能构成三角形");
            }

        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
