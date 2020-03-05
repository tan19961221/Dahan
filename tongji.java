import java.util.Arrays;

public class tongji {
     
    public static void main(String[] args) {
 
        String str = "11223451627138",strsave = "";
         
        char[] xx = str.toCharArray();
        Arrays.sort(xx);
        StringBuffer sb = new StringBuffer();
        sb.append(xx);
        str = sb.toString();
         
        for(int i = 0; i<str.length(); i ++){
            if(!strsave.equals(""+str.charAt(i))){
                strsave = String.valueOf(str.charAt(i));
                System.out.print(str.charAt(i)+"出现次数:");
                System.out.println(str.lastIndexOf(str.charAt(i))-str.indexOf(str.charAt(i))+1);
            }
             
        }
    }
}