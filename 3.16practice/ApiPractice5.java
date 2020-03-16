package s10;
/*5. 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，
应该输出为“我ABC”而不是“我ABC+汉的半个”。
 */

//没写出来 
public class ApiPractice5 {
    public static void main(String[] args) {
        String str1 = "我ABC";
        String str2 = "我ABC汉DEF";
        sString(str1, 4);
        sString(str2, 6);
    }
    public static void sString(String src, int length) {
        int byteNum = 0;

        if (null == src) {
            System.out.println("The source String is null!");
            return;
        }

        byteNum = src.length();
        byte bt[] = src.getBytes(); // 将String转换成byte字节数组


    }

}
