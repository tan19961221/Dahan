/*你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
    输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
    输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。
*/
import java.util.Scanner;

class practice51 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int num=0, num1 = 0,num2 = 0;
            num = in.nextInt();
            while (num != -1) {
                if (num % 2 == 0) {
                    num1++;
                } else {
                    num2++;
                }
                num = in.nextInt();
            }
            System.out.println(num2+" "+num1);
        }
}