package s18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12345);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                s.getInputStream()));
        //BufferedWriter bw = new BufferedWriter(new FileWriter("2.txt"));

        PrintWriter pw = new PrintWriter(new FileWriter("2.txt"), true);

        String line = null;
        while ((line = br.readLine()) != null) {
            /*bw.write(line);
            bw.newLine();
            bw.flush();*/
            pw.println(line);
        }
        /*BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(
                s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();*/

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("上传成功");
        s.close();
        //bw.close();
        pw.close();
        ss.close();
    }

}
