package Arrays;

import java.util.Arrays;

public class LargestNum {

    //Brute Force
    public static int LargestNum(int arr[]) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    //Optimize Solution
    public static int LargestNumber(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = {-1, -2, -3, -4, -3};
        System.out.println(LargestNumber(arr));
    }
}
