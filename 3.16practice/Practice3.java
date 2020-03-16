package s10;
//3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写

public class Practice3 {
    public static void main(String[] args) {
        String str1 ="abcdw";
        String str2 = "ABCDw";

        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
