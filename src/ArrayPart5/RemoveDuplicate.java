package ArrayPart5;

import java.util.*;

public class RemoveDuplicate {

    public static int removeDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5};
        System.out.println(removeDuplicate(arr));
    }
}
