package s16;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器端Socket对象
        ServerSocket ss = new ServerSocket(12354);

        // 监听客户端
        Socket s = ss.accept();

        // 获取输出流,输出到文本文件中
        BufferedReader br = new BufferedReader(new InputStreamReader(
                s.getInputStream()));
        // 输入到文本文件
        //BufferedWriter bw = new BufferedWriter(new FileWriter("1.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("1.txt"), true);

        String line = null;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        // 释放资源
        pw.close();
        s.close();
        ss.close();
    }

}