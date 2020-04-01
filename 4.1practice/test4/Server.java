package s19;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6333);
        // 得到客户端对象
        Socket s = ss.accept();
        InputStream in = s.getInputStream();
        FileOutputStream fos = new FileOutputStream("2.jpg");
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = in.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        OutputStream out = s.getOutputStream();
        out.write("上传成功".getBytes());
        out.close();
        s.close();
        ss.close();
    }
}
