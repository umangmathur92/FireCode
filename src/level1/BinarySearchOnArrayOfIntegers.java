package level1;

public class BinarySearchOnArrayOfIntegers {

    public static void main(String[] args) {
        int[] arr = {2,5,7,8,9};
        boolean hasInputInteger = binarySearch(arr, 9);
        System.out.println(hasInputInteger);
    }

    public static Boolean binarySearch(int[] arr, int n){
        int left = 0;
        int right = arr.length - 1;
        while (left<=right) {
            int mid = (left + right) / 2;
            if (arr[mid] == n) {
                return true;
            } else if (n < arr[mid]) {
                right = mid - 1;
            } else if (n > arr[mid]) {
                left = mid + 1;
            }
        }
        return false;
    }


}
