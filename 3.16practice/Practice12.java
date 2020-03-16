package s10;
/*12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"*/
public class Practice12 {
    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        System.out.println(str.replaceAll("谁","被子"));
    }

}
