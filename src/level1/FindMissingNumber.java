package level1;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10};
        int missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            int currNum = arr[i];
            sum = sum + currNum;
        }
        return 55-sum;
    }
}
