package s10;
//将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
// 将上诉字节数组  从指定的位置开始到结束转换成字符串输出
public class Practice1 {
    public static void main(String[] args) {
        byte[] by = {65,67,68,97,98,101};
        String str=new String(by);
        System.out.println(str);
        String s = new String(by).substring(1,3);
        System.out.println(s);
    }
}
