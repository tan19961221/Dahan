package test5;

public class Student extends Person{
    public String school;
    public int stuNumber;

    public Student(){

    }


    public Student(String name, String gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学习");
    }
}
