//输入10个整数存入数组，然后复制到b数组中输出
import java.util.Scanner;

class practice45 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] b = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个整数：");
            arr[i] = sc.nextInt();
            b[i] = arr[i];
        }
        System.out.println("复制到b数组中输出:");
        for(int j=0;j<b.length;j++){
        System.out.print(" "+b[j]);
       }
    }
}