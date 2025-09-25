package ArrayPart4;

import java.util.*;

public class TwoSum {

    //brute Force Approch
    public static int[] twosum(int[] arr, int target) {
        int element[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    element[0] = i;
                    element[1] = j;
                    return element;
                }
            }
        }
        return new int[]{-1, -1};
    }

    //Optimal Approch - if we want pair values
    public static int[] OptimalSolTwoSum(int arr[], int target) {
        Arrays.sort(arr);
        int lp = 0, rp = arr.length - 1;
        while (lp < rp) {
            if (arr[lp] + arr[rp] == target) {
                return new int[]{arr[lp], arr[rp]};
            } else if (arr[lp] + arr[rp] < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 8, 11};
        int target = 14;
        int result[] = OptimalSolTwoSum(arr, target);
        if (result[0] != -1) {
            System.out.println(true);
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println(false);
            System.out.println(Arrays.toString(result));
        }
    }
}
