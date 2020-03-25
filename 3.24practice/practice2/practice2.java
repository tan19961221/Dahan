package practice2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

//利用字节流或者换成字节流的方式以指定的格式输入数据 如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据
public class Practice2 {
    public static void main(String[] args) {
        File file = new File("2.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> list = new ArrayList<>();
        list.add("儿童");
        list.add("请问");
        list.add("热天");
        list.add("吃不");
        list.add("梵蒂冈的风格");
        list.add("瘦成闪电");
        list.add("个饭 ");
        list.add("那么过分");
        list.add("违反");
        list.add("突然突然");
        list.add("在重新出现");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);//追加内容
            for (int i = 0; i < list.size(); i++) {
                outputStream.write(list.get(i).getBytes());
                if (i != list.size() - 1) {
                    if ((i + 1) % 5 == 0) {
                        outputStream.write(",".getBytes());
                        outputStream.write("\n".getBytes());
                    } else {
                        outputStream.write(",".getBytes());
                    }
                } else {
                    outputStream.write(".".getBytes());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
