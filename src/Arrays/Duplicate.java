package Arrays;

import java.util.HashMap;

public class Duplicate {

    //Brute Force Approch
    public static int DuplicateEle(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    count++;
                }
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    //optimal Solution with Tc-O(n) & SC-O(1)
    public static int findDuplicate(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : arr) {
            if (map.containsKey(key)) {
                return key;
            }
            map.put(key, 1);
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
    }
}
