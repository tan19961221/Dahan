//在一个数组中找出最大和最小值，并输出它们的位置
import java.util.Scanner;

class practice48 {

    public static void main(String[] args) {
        int i=0;
            int min=0;
            int max=0;
            int A[]={74,48,30,17,62};
            min=max=A[0];
            System.out.print("数组A的元素包括：");
            int j =0;
            int n =0 ;
            for(i=0;i<A.length;i++)
            {
                System.out.print(A[i]+" ");
                if(A[i]>max)
                    j =i;
                max=A[i];
                if(A[i]<min)
                    min=A[i];
                n =i;
            }
            System.out.println("数组的最大值是："+max+".数组的位置是："+(j+1));
            System.out.println("数组的最小值是："+min+".数组的位置是："+(n+1));
        }
}