package s13;

public class Student {
    private static int count = 0;
    private int number;
    private  String name;

    public Student() {
        number = count;
        count++;
    }

    public Student( String name) {
        number = count;
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
