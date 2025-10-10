package Searching;

import java.util.Arrays;

public class BinarySearch {
    //To Perform Binary Search is needed to Array Already Sorted

    public static boolean isKeyFound(int arr[], int key) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {10, 12, 14, 15, 16, 18, 20};
        int key = 19;
        System.out.println(isKeyFound(arr, key));
    }

}
