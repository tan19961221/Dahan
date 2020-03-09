public class Student {
    private String name;
    private String chineseName;
    private String mathName;
    private String englishName;
    private String scienceName;
    private double chineseScore;
    private double mathScore;
    private double englishScore;
    private double scienceScore;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getChineseName() {
        return chineseName;
    }
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getMathName () {
        return mathName;
    }
    public void setMathName(String mathName) {
        this.mathName = mathName;
    }

    public String getEnglishName() {
        return englishName;
    }
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getScienceName() {
        return scienceName;
    }

    public void setScienceName(String scienceName) {
        this.scienceName = scienceName;
    }

    public double getChineseScore() {
        return chineseScore;
    }
    public void setChineseScore(double chineseScore) {
        this.chineseScore = chineseScore;
    }

    public double getMathScore() {
        return mathScore;
    }
    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }
    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }
    public void setScienceScore(double scienceScore) {
        this.scienceScore = scienceScore;
    }

    public double avg() {
        return (getChineseScore() + getEnglishScore() + getMathScore() + getScienceScore()) / 4;
    }

    public static void maxAvgScore(Student[] students) {
        for (int i = 0; i < students.length-1; i++) {
            if (students[i].avg() > students[i+1].avg()) {
                Student x = students[i];
                students[i] = students[i + 1];
                students[i + 1] = x;
            }
        }
        System.out.println("平均分最高的学生是：" + students[students.length - 1].getName());
        System.out.println("语文成绩是" + students[students.length - 1].getChineseScore());
        System.out.println("数学成绩是" + students[students.length - 1].getMathScore());
        System.out.println("英语成绩是" + students[students.length - 1].getEnglishScore());
        System.out.println("理科成绩是" + students[students.length - 1].getScienceScore());
    }

    public static void maxScienceScore(Student[] students) {
        for (int i = 0; i < students.length-1; i++) {
            if (students[i].getScienceScore() > students[i + 1].getScienceScore()) {
                Student x = students[i];
                students[i] = students[i + 1];
                students[i + 1] = x;
            }
        }
        System.out.println("理科成绩最高的学生是：" + students[students.length - 1].getName());
        System.out.println("他的理科成绩是" + students[students.length - 1].getScienceScore());
    }



}
