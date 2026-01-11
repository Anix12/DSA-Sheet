package ArrayPart3;

import java.util.*;

public class MajorityElement {

    //Q Majority Element Appear more than N/2 Time

    //Brute Force Approch Tc-O(n2)
    public static int MajorityElem(int arr[], int target) {
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) continue;
            num = arr[i];
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                }
                if (count >= arr.length / 2) return arr[i];
            }
        }
        return -1;
    }

    //Better Approch Tc-O(nlogn)
    public static int MostOccurElement(int nums[], int n) {
        Arrays.sort(nums);
        return nums[n / 2];
    }

    //Optimal Approch Tc-O(n) Sc-O(n)
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

    //Optimal Approch
    //Moore's Voting Approch Tc-O(n)
    public static int OptimalMostOccur(int arr[], int target) {
        int freq = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (freq == 0) {
                ans = arr[i];
            }
            if (ans == arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        int n = nums.length;
        System.out.println(OptimalMostOccur(nums, n));
    }
}
