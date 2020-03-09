//7.输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）
import java.util.Scanner;

class practice37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=0; 
        int b=0;
        a = x % 10;
        System.out.print(a);
        while (x > 10) {
            x = x / 10;
            b = x % 10;
            System.out.print(b);
        }
    }
}