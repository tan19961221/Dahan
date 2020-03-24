package practice3;
//创建a/test.txt文件并在其中输入"hello world",创建一个输入流读取该文件中的文本,并且把小写的l变成大写L再利用输出流写入到b/test.txt中

import java.io.*;

public class practice3 {
    public static void main(String[] args) {
        new File("a").mkdir();
        new File("b").mkdir();
        File file = new File("a/test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file1 = new File("b/test.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fos = null;
        String content = "hello world";
        byte[] b = content.getBytes();
        try {
            fos = new FileOutputStream(file);
            for (int i = 0; i < b.length; i++) {
                try {
                    fos.write(b[i]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*File file1 = new File("b/test.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        try (
                BufferedReader br = new BufferedReader(new FileReader(file));
                BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
        ) {
            String newContent = br.readLine().replace("l", "L");
            bw.write(newContent);
            System.out.println("通过过滤写到 文件b/test.txt中的内容是：" + newContent);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
