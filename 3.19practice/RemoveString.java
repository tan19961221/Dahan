package s14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        Set set = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.toCharArray()[i]);
        }
        for(Object x : set){
            System.out.print(x);
        }
    }
}
