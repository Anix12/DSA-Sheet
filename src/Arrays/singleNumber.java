package Arrays;

import java.util.*;

public class singleNumber {

    //Tc-O(n^2) Sc-O(1)
    public static int oneTimeOccur(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    //Tc-O(n) Sc-O(n)
    public static int oneTimeOccurElem(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : arr) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 6, 6, 5, 8, 5};
        System.out.println(oneTimeOccurElem(arr));
    }
}
