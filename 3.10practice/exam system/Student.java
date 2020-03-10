package s3;

public class Student {
    private String stuNum;
    private String stuNume;
    private String stuGrade;
    private static int stuScore=0;

    public Student(){

    }

    public Student(String stuNum, String stuNume, String stuGrade) {
        this.stuNum = stuNum;
        this.stuNume = stuNume;
        this.stuGrade = stuGrade;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuNume() {
        return stuNume;
    }

    public void setStuNume(String stuNume) {
        this.stuNume = stuNume;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "stuNum='" + stuNum + '\'' +
                ", stuNume='" + stuNume + '\'' +
                ", stuGrade='" + stuGrade + '\'' +
                '}';
    }

    public static void getStuScore() {
        System.out.println( "考试结束，最后成绩为：" + Student.stuScore );
    }

    public static void setStuScore(int stuScore){
        Student.stuScore +=stuScore;
    }
}
