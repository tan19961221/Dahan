package s14;

import java.util.HashSet;
import java.util.Set;

public class Random {
    public static void main(String[] args) {
        Set number = new HashSet();
        do {
            number.add((int) (Math.random() * 20 + 1));
        } while (number.size() < 10);
        System.out.println(number);
    }

}
