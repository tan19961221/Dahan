package s10;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/*16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组*/
public class Practice16 {
    public static void main(String[] args) {
        byte[] by = {89,90, 91, 92};
        String str=new String(by,StandardCharsets.UTF_8);
        System.out.println(str);
        byte[] str1 = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(str1));
    }
}
