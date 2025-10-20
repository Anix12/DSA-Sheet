package ArrayPart5;

import java.util.*;

public class RemoveDuplicate {
    //better Solution Tc-O(n)
    public static int duplicateRemove(int arr[]) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        return count;
    }


    // TC- O(n) and SC-O(n)
    public static int removeDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(duplicateRemove(arr));
    }
}
