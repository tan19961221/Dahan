package practice1;




//没写出来。。。

import java.io.*;

public class practice1 {
    public static void main(String[] args) {
        File file = new File("Users/edz/javaseFile/untitled");
        File file1= new File("1.txt");
        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        searchFile(file);
    }

    public static void searchFile(File file) {
        if (file.isDirectory()) {
            File[] fileArray = file.listFiles();
            for (int i = 0; i < fileArray.length; i++) {
                searchFile(fileArray[i]);
            }
        } else {

            if (file.toString().endsWith(".txt")
            ) {
                try {
                    InputStream is = new FileInputStream(file);
                    OutputStream os = new FileOutputStream("1.txt",true);
                    byte[] by = new byte[(int)file.length()];
                    is.read(by);
                    os.write(by);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }
}
