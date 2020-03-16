package s10;

public class StringBufferTest {
    public static void main(String[] args){
        StringBuffer str=new StringBuffer();
        //Character a='a';
        /*for(int i=0;i<25; i++){
            buf.append(a);
            a=new Character((char)(a+1));
        }*/
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
