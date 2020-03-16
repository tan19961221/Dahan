package s10;
/*4. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
“To be or not to be"，将变成"oT eb ro ton ot eb."。
 */
import java.util.*;

public class ApiPractice4 {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String str1[] = str.split(" ");
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < str1.length; i++) {
            StringBuffer sb = new StringBuffer(str1[i]);
            sb.reverse();
            sb1.append(sb);
            if(i == str1.length-1){
                sb1.append(".");
            }else{
                sb1.append(" ");
            }
        }
        System.out.println(sb1);
    }
}
