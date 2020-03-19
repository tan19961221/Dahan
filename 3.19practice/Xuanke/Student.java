package Xuanke;
import java.util.Iterator;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private Set<Course> course;

    public Student() {
    }

    public Student(int id, String name, Set<Course> course) {
        this.id = id;
        this.name = name;
        this.course = course;
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

    public Set<Course> getCourse() {
        return course;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void insertCourse(Course course){
        this.course.add(course);
    }
}
