package s16;
//客户端键盘录入，服务器输出文本文件

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端Socket对象
        Socket s = new Socket(InetAddress.getLocalHost().getHostAddress(), 12354);
        Scanner scanner =new Scanner(System.in);
        OutputStream os = s.getOutputStream();
        System.out.println("输入数据:");
        String str = scanner.nextLine();
        os.write(str.getBytes());
        os.flush();
        s.shutdownOutput();
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[200];
        int len = is.read(bytes);
        str = new String(bytes,0,len);
        System.out.println(str);
        is.close();
    }
}
