package s19;
//上传图片案例

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket(InetAddress.getLocalHost().getHostAddress(),6333);
        FileInputStream fis = new FileInputStream("1.jpg");
        OutputStream out = s.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = fis.read(buf))!=-1){
            out.write(buf,0,len);
        }
        // 告诉服务端数据以写完
        s.shutdownOutput();
        InputStream in = s.getInputStream();
        byte[] bufIn =new byte[1024];
        int num = in.read(bufIn);
        System.out.println(new String(bufIn,0,num));
        fis.close();
        s.close();
    }
}
