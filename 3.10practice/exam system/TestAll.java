package s3;
import java.util.Scanner;

public class TestAll {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        Student st=new Student();
        System.out.println("请输入你的编号：");
        st.setStuNum(sc.next());
        System.out.println("请输入你的姓名：");
        st.setStuNume(sc.next());
        System.out.println("请输入你的年级：");
        st.setStuGrade(sc.next());
        Test Test1=new Test("01","01吗？","A:1","B:2","C:3","D:4","A");
        Test Test2=new Test("02","02吗？","A:1","B:2","C:3","D:4","B");
        Test Test3=new Test("03","03吗？","A:1","B:2","C:3","D:4","C");
        Test Test4=new Test("04","04吗？","A:1","B:2","C:3","D:4","D");
        Test Test5=new Test("05","05吗？","A:1","B:2","C:3","D:4","B");
        Test Test6=new Test("06","06吗？","A:1","B:2","C:3","D:4","A");
        Test Test7=new Test("07","07吗？","A:1","B:2","C:3","D:4","C");
        Test Test8=new Test("08","08吗？","A:1","B:2","C:3","D:4","A");
        Test Test9=new Test("09","09吗？","A:1","B:2","C:3","D:4","D");
        Test Test10=new Test("10","10吗？","A:1","B:2","C:3","D:4","B");
        Test Test11=new Test("11","11吗？","A:1","B:2","C:3","D:4","B");
        Test Test12=new Test("12","12吗？","A:1","B:2","C:3","D:4","C");
        Test Test13=new Test("13","13吗？","A:1","B:2","C:3","D:4","D");
        Test Test14=new Test("14","14吗？","A:1","B:2","C:3","D:4","A");
        Test Test15=new Test("15","15吗？","A:1","B:2","C:3","D:4","A");
        Test Test16=new Test("16","16吗？","A:1","B:2","C:3","D:4","A");
        Test Test17=new Test("17","17吗？","A:1","B:2","C:3","D:4","A");
        Test Test18=new Test("18","18吗？","A:1","B:2","C:3","D:4","A");
        Test Test19=new Test("19","19吗？","A:1","B:2","C:3","D:4","A");
        Test Test20=new Test("20","20吗？","A:1","B:2","C:3","D:4","A");
        Test Test21=new Test("21","21吗？","A:1","B:2","C:3","D:4","A");
        Test Test22=new Test("22","22吗？","A:1","B:2","C:3","D:4","A");
        Test Test23=new Test("23","23吗？","A:1","B:2","C:3","D:4","A");
        Test Test24=new Test("24","24吗？","A:1","B:2","C:3","D:4","A");
        Test Test25=new Test("25","25吗？","A:1","B:2","C:3","D:4","A");
        Test Test26=new Test("26","26吗？","A:1","B:2","C:3","D:4","A");
        Test Test27=new Test("27","27吗？","A:1","B:2","C:3","D:4","A");
        Test Test28=new Test("28","28吗？","A:1","B:2","C:3","D:4","A");
        Test Test29=new Test("29","29吗？","A:1","B:2","C:3","D:4","A");
        Test Test30=new Test("30","30吗？","A:1","B:2","C:3","D:4","A");
        Test[] tests={Test1,Test2,Test3,Test4,Test5,Test6,Test7,Test8,Test9,Test10,Test11,Test12,Test13,Test14,Test15,Test16,Test17,Test18,Test19,Test20,Test21,Test22,Test23,Test24,Test25,Test26,Test27,Test28,Test29,Test30};
        /*重新 建个数组存储  在上面30个数据的数组随机取的10个元素，用来输出
        （这里写的时候出了问题，卡住了没写出来，）
        想法是1-30，随机出10个数，然后存到新数组x【】，然后输出tests【x[0-9]-1】,就是题目。
          题目输出，定义一个i=0 搞个do{.....;i++}while（i<10）
          do 里面输出题目后，学生输入，与Test.getAnwser 对比，执行我在Student里的setStuScore,加分数，
          题目都做完即do 执行完后执行Student里的getStuScore


          整体思路有了，但是上面卡住了，没写出来，对于随机取数的运用不太熟悉，老师可以讲下

         */
    }


    }
