package ArrayPart4;

import java.util.*;

public class LongestSubArray {


    //Brute Force Approch
    public static int[] arrayForm(int arr[], int i, int j) {
        int num[] = new int[j - i + 1];
        int start = 0;
        for (int k = i; k <= j; k++) {
            num[start++] = arr[k];
        }
        return num;
    }

    public static List SubarraySum(int arr[]) {
        List<int[]> subarrays = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == 0) {
                    int[] newArray = arrayForm(arr, i, j);
                    subarrays.add(newArray);
                }
            }
        }
        return subarrays;
    }

    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
        List<int[]> subarrays = SubarraySum(arr);
        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}
