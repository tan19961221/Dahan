package s9;
//快速排序

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, y,z;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = arr[low];
        while (i < j) {
            while (temp <= arr[j] && i < j) {
                j--;
            }
            while (temp >= arr[i] && i < j) {
                i++;
            }

            if (i < j) {
                z = arr[i];
                y = arr[j];
                arr[i] = y;
                arr[j] = z;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
