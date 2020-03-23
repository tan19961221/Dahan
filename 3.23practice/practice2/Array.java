package s16;

public class Array<T extends Number> {

    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public void getMax() {
        System.out.println("数组元素中最大的值为: " + max);
    }

    public void getMin() {
        
        System.out.println("数组元素中最小的值为: " + min);
    }

    public void getAvg() {
        System.out.println("该数组的平均值为:  " + avg);
    }
}
