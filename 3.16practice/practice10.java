package s10;
/*10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串*/
public class practice10 {
    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        System.out.println(str.substring(1,str.length()));
        System.out.println(str.substring(1,4));
    }
}
