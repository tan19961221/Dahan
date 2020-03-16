package s10;
//3.将字符串中指定部分进行反转。
public class ApiPractice3 {
    public static void main(String[] args) {
        String str = "abcdefghijklmn";
        int start = 3;
        int end = 9;
        System.out.println("原先的字符串: "+str);
        String strNew=strReverse(str, start, end);
        System.out.println("指定部分进行反转后的字符串: "+strNew);
    }
    private static String strReverse(String str, int start, int end) {
        String strNew = str.substring(0, start);
        for (int i = end; i >= start; i--) {
            strNew += str.charAt(i);
        }
        strNew += str.substring(end + 1);
        return strNew;
    }
}
