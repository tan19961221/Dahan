//声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分
import java.util.Scanner;

class practice46 {

    public static void main(String[] args) {
        double arr[]= new double [8];
            double max= 0,avg = 0,min = 150,sum = 0;
            System.out.println("请输入8个数字");
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("总分为:"+sum);
            avg = sum/8;
            System.out.println("平均分:"+avg);
            for (int i = 0; i < arr.length; i++) {
                if (max<arr[i]) {
                    max = arr[i];
                }
                min = min>arr[i]?arr[i]:min;
            }
            System.out.println("最大值:"+max);
            System.out.println("最小值:"+min);
    }
}