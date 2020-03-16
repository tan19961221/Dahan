package s10;
/*5.第四题字符串判断是否以"我"开头,判断是否以"剑"结尾*/
public class Practice5 {
    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        System.out.println(str.endsWith("剑"));
        System.out.println(str.startsWith("我"));
    }
}
