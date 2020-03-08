//1.任意输入 n行 n列的乘法口诀表
import java.util.Scanner;

class practice41 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int mul=0;
            for (int i=1;i<=n;i++) {
                for (int j=1;j<=i;j++)
                {
                    mul=i*j;
                    System.out.print(j+"*"+i+"="+mul+"\t");
                }
                System .out .println();
            }
    }
}