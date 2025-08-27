package Arrays;

import java.util.Arrays;

public class sortArray {
    //Brute-Force Approch
    public static void sortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] seqSortArray(int arr[]) {
        Arrays.sort(arr);
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 0, 2, 2};
        seqSortArray(arr);
        printArray(arr);
    }
}
