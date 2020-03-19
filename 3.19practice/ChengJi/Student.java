package ChengJi;

public class Student implements Comparable{
    private int id;
    private String name;
    private int Score;

    public Student() {
    }

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        Score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int number1 =  (int)(((Student) o).getScore() - this.getScore());
        return number1==0 ? (((Student) o).getId() - this.getId()) : number1;
    }
}
