package s16;

public class TestArray {
    public static void main(String[] args) {
        Array<Integer> array1 = new Array<Integer>(new Integer[]{1, 2, 3,4,5});
        Array<Double> array2 = new Array<Double>(new Double[]{3.0, 5.0, 4.0, 6.0, 7.0});
        System.out.println("Integer型:");
        array1.getMax();
        array1.getMin();
        array1.getAvg();
        System.out.println("Double型:");
        array2.getMax();
        array2.getMin();
        array2.getAvg();
    }
}