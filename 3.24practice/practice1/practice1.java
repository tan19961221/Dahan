package practice1;

import java.io.*;

public class Practice1 {
    static BufferedWriter bufferedWriter = null;
    static BufferedReader bufferedReader = null;
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/edz/javaseFile/untitled");

        searchFile(file);
    }

    public static void searchFile(File file) throws IOException {
        File[] file2 = file.listFiles();
        for (File f : file2) {
            if (f.isDirectory()) {
                searchFile(f); //如果是文件夹重新调用一下方法
            } else {
                if (f.getName().endsWith(".txt")) {
                     bufferedReader = new BufferedReader(new FileReader(f));
                     bufferedWriter = new BufferedWriter(new FileWriter(new File("1.txt"), true));
                    String str = bufferedReader.readLine();
                    while (str != null) {
                        bufferedWriter.write(str + "\n");
                        str = bufferedReader.readLine();
                    }
                    bufferedWriter.close();
                    bufferedReader.close();

                }
            }
        }
    }
}