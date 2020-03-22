package s15;

public class Student {
    private String stuName;
    private int stuId;
    private int stuPwd;
    private double stuScore;

    public Student() {
    }

    public Student(String stuName, int stuId, int stuPwd) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuPwd = stuPwd;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(int stuPwd) {
        this.stuPwd = stuPwd;
    }

    public double getStuScore() {
        return stuScore;
    }

    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                ", stuPwd=" + stuPwd +
                ", stuScore=" + stuScore +
                '}';
    }
}