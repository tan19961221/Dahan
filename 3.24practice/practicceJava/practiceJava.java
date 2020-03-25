package practicceJava;

import java.io.*;

public class PracticeJava {

    public static int num = 0;

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/edz/javaseFile/untitled");
        String[] strFile=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".java")) {
                    return true;
                }
                return false;
            }
        });
        for (String st:strFile) {
            System.out.println(st);
        }
    }

}
