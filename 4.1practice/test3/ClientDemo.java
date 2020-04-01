package s18;
//客户端文本文件，服务器输出文本文件

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost().getHostAddress(), 12345);
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
         //       s.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("1.txt"));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        String line = null;
        while ((line = br.readLine()) != null) {
            /*bw.write(line);
            bw.newLine();
            bw.flush();*/
            pw.println(line);
        }
        br.close();
        s.close();

    }
    }
