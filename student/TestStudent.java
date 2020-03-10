import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student[] stu = new Student[5]; //装五个学生学生对象
        //使用循环的方式给数组赋值
        Scanner  sc=new Scanner(System.in);
        for (int i = 0; i < stu.length; i++) {
            Student  st=new Student();
            System.out.println("请输入第"+(i+1)+"个学生的姓名:");
            st.setStuName(sc.next());
            System.out.println("请输入第"+(i+1)+"个学生的成绩:");
            double math=sc.nextDouble();
            st.setMath(math);
            double eng=sc.nextDouble();
            st.setEnglish(eng);
            double ch=sc.nextDouble();
            st.setChinese(ch);
            double science=sc.nextDouble();
            st.setScience(science);
            stu[i]=st;
        }

        //得到平均分最高
        int  index=0;
        double   maxAvg=stu[0].getAvgScore();//假设默认的是第一个数据
        for (int i = 1; i < stu.length; i++) {
            if(maxAvg<stu[i].getAvgScore()){
                maxAvg=stu[i].getAvgScore(); //得到平均分最大值其实就是得到具体的哪个对象
                index=i;//得到 平均分最大值的下标
            }
        }
        System.out.println("平均分最大值的人所有的信息如下:"+stu[index].toString());
        //得到理科成绩最高
        int x=0;
        double maxScience=stu[0].getScience();
        for (int i = 1; i < stu.length; i++) {
            if(maxScience<stu[i].getScience()){
                maxScience=stu[i].getScience(); //得到理科最大值其实就是得到具体的哪个对象
                x=i;//得到 理科最大值的下标
            }
        }
        System.out.println("理科成绩最高的学生是:"+stu[x].getStuName());

    }
}
