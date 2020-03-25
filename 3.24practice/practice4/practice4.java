package practice4;


//后面没写出来


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Practice4 {
    public static class Student {
        private String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }

    public static void main(String[] args) throws IOException {
        List<Student> list=new ArrayList<>();
        list.add(new Student("张三",20));
        File file=new  File("Student.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        OutputStream outputStream=null;
        try {
            outputStream =new FileOutputStream(file);
            for (int i = 0; i < list.size(); i++) {
                Student  student=list.get(i);
                outputStream.write(("姓名:"+student.getName()+",").getBytes());
                outputStream.write(("年龄:"+student.getAge()).getBytes());
                outputStream.write("\n".getBytes());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream!=null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
