package s10;
//3.将字符串中指定部分进行反转。
public class ApiPractice3 {
    public static void main(String[] args) {
        String str = "abcdefghijklmn";
        // 开始位置的下标
        int start = 3;
        // 结束位置的下标
        int end = 9;
        System.out.println("原先的字符串: "+str);
        String strNew=strReverse(str, start, end);
        System.out.println("指定部分进行反转后的字符串: "+strNew);
    }
    private static String strReverse(String str, int start, int end) {
        String strNew = str.substring(0, start);
        // 从end开始遍历取值，追加到截取的子串后面
        for (int i = end; i >= start; i--) {
            // 获取指定位置的值
            strNew += str.charAt(i);
        }
        // 截取子串，追加到strNew后面
        strNew += str.substring(end + 1);
        return strNew;
    }
}
