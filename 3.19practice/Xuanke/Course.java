package Xuanke;

public class Course {
    private int number;
    private String CourseName;

    public Course() {
    }

    public Course(int number, String courseName) {
        this.number = number;
        CourseName = courseName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                ", CourseName='" + CourseName + '\'' +
                '}';
    }

    public String show(){
        return number + " " + CourseName;
    }
}
