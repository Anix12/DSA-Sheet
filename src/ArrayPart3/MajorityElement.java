package ArrayPart3;

import java.util.*;

public class MajorityElement {
    //Brute Force Approch Tc-O(n) Sc-O(n)
    public static int MostOccurEle(int nums[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }

    //Optimal Approch Tc-O(n)
    public static int MostOccurElement(int nums[], int n) {
        Arrays.sort(nums);
        return nums[n / 2];
    }


    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        int n = nums.length;
        System.out.println(MostOccurEle(nums, n));
    }
}
