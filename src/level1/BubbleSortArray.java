package level1;

import java.util.Arrays;

public class BubbleSortArray {

    public static void main(String[] args) {
        int[] arr = {4,5,3,8,9,2,7};
        int[] sortedArr = bubbleSortArray(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] bubbleSortArray(int[] arr){
        boolean isSorted = false;
        int lastUnsorted = arr.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        return arr;
    }

}
