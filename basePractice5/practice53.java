//3.公司年销售额求和
import java.util.Scanner;

class practice53 {

    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < 4; i++) {
            System.out.println("第"+i+"季度营业额：(万元)");
            Scanner sc = new Scanner(System.in);
            int num =sc.nextInt();
            sum+=num;
        }
        System.out.println("全年营业额为:"+sum+"(万元)");
        }
}