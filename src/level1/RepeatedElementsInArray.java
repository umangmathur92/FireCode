package level1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RepeatedElementsInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,5,2,9,2};
        String duplicate = duplicate(arr);
        System.out.println(duplicate);
    }

    public static String duplicate(int[] numbers) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        Arrays.sort(numbers);
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] == numbers[i-1]) {
                linkedHashSet.add(numbers[i]);
            }
        }
        return linkedHashSet.toString();
    }
}

/*List<Integer> outputList = new ArrayList<>();
        Arrays.sort(numbers);
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<numbers.length; i++) {
            int currNumber = numbers[i];
            map.put(currNumber, map.containsKey(currNumber) ? map.get(currNumber) + 1 : 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key)>1) {
                outputList.add(key);
            }
        }
        return outputList.toString();*/