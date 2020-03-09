//2.输入三个班，每班10个学生的成绩，求每个班的总分和平均分
import java.util.Scanner;

class practice42 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            double sum=0;
            double average=0;
            for(int i=1;i<=3;i++){
                System.out.println("输入第"+i+"班的10个成绩");
                for(int j=1;j<=10;j++){
                    double grade=sc.nextDouble();
                    sum=sum+grade;
                }
                average=sum/10;
                System.out.println("第"+i+"班总分数是:"+" "+sum);
                System.out.println("第"+i+"班平均分数是:"+" "+average);
            }
    }
}