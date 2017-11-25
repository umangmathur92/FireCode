package level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class FindNumberThatAppearsOnce {

    public static void main(String[] args) {
        int[] arr = {2,5,7,2,8,3,9,2,7,8,3};
        int uniqueNum = singleNumber(arr);
        System.out.println(uniqueNum);
    }

    public static int singleNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<A.length; i++) {
            int currNum = A[i];
            if (map.containsKey(currNum)) {
                map.put(currNum, map.get(currNum) + 1);
            } else {
                map.put(currNum, 1);
            }
        }
        for (int key: map.keySet()) {
            if (map.get(key)==1) {
                return key;
            }
        }
        return 0;
    }
}
