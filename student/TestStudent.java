public class TestStudent {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setName("小1");
        student1.setChineseName("语文");
        student1.setMathName("数学");
        student1.setEnglishName("英语");
        student1.setScienceName("理科");
        student1.setChineseScore(90.0);
        student1.setMathScore(85.0);
        student1.setEnglishScore(80.0);
        student1.setScienceScore(80.0);

        Student student2=new Student();
        student2.setName("小2");
        student2.setChineseName("语文");
        student2.setMathName("数学");
        student2.setEnglishName("英语");
        student2.setScienceName("理科");
        student2.setChineseScore(92.0);
        student2.setMathScore(86.0);
        student2.setEnglishScore(88.0);
        student2.setScienceScore(83.0);

        Student student3=new Student();
        student3.setName("小3");
        student3.setChineseName("语文");
        student3.setMathName("数学");
        student3.setEnglishName("英语");
        student3.setScienceName("理科");
        student3.setChineseScore(80.0);
        student3.setMathScore(95.0);
        student3.setEnglishScore(70.0);
        student3.setScienceScore(90.0);

        Student student4=new Student();
        student4.setName("小4");
        student4.setChineseName("语文");
        student4.setMathName("数学");
        student4.setEnglishName("英语");
        student4.setScienceName("理科");
        student4.setChineseScore(78.0);
        student4.setMathScore(77.0);
        student4.setEnglishScore(80.0);
        student4.setScienceScore(81.0);

        Student student5=new Student();
        student5.setName("小5");
        student5.setChineseName("语文");
        student5.setMathName("数学");
        student5.setEnglishName("英语");
        student5.setScienceName("理科");
        student5.setChineseScore(99.0);
        student5.setMathScore(79.0);
        student5.setEnglishScore(84.0);
        student5.setScienceScore(99.0);
        Student[] students = {student1, student2, student3, student4, student5};
        Student.maxAvgScore(students);
        Student.maxScienceScore(students);
    }
}
