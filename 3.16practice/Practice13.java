package s10;
/* 13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"*/
public class Practice13 {
    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        System.out.println(str.replaceAll("你", "哈"));
    }
}
