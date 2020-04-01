package s17;
//客户端文本文件，服务器输出到控制台

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost().getHostAddress(), 21345);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                s.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("1.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        s.close();
    }

}
