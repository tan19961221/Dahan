package s10;
/*9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"*/
public class Practice9 {
    public static void main(String[] args) {
        String str ="我是你的谁,我是你的剑";
        System.out.println(str.lastIndexOf("你"));
        System.out.println(str.indexOf("你",3));
    }
}
