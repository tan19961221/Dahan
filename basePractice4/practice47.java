//定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。
import java.util.Scanner;

class practice47 {

    public static void main(String[] args) {
        int[] arr = new int [10];
            for (int i = 0; i < arr.length;) {
                Scanner input = new Scanner(System.in);
                System.out.println("请输入第"+(i+1)+"个数：");
                if (input.hasNextInt()) {//判断控制台得到的是否是整数
                    int num = input.nextInt();
                    arr[i] = num;
                    i++;
                }else {
                    System.out.println("请输入一个整数！");
                }
            }
            int a = 0;
            System.out.println("输入一个整数：");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            int b = 0;
            for (int j = 0; j < 10; j++) {
                if (a == arr[j]) {
                    System.out.println("下标为:" + j);
                    b++;
                }
            }
            if (b == 0) {
                System.out.println("没有这个数！");
            }
    }
}