package s10;

public class StringBufferTest {
    public static void main(String[] args){
        StringBuffer str=new StringBuffer();
        for(int i = 97; i < 97 + 26; i++) {
            str.append((char)i);
        }
        System.out.println("添加之后："+str);
        str.reverse();
        System.out.println("翻转之后："+str);
        str.delete(0,5);
        System.out.println("删除之后："+str);
    }
}
