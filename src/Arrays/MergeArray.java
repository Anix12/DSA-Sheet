package Arrays;
import java.util.Arrays;
public class MergeArray {
    //Merge two Sorted Arrays With Extra Space
    public static int[] mergeArrWithExtraSpace(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int arr[] = new int[m + n];

        int lp = 0, rp = 0;
        int idx = 0;
        while (lp < m && rp < n) {
            if (arr1[lp] < arr2[rp]) {
                arr[idx] = arr1[lp];
                lp++;
            } else {
                arr[idx] = arr2[rp];
                rp++;
            }
            idx++;
        }
        if (lp != arr1.length) {
            while (lp < m) {
                arr[idx] = arr1[lp];
                lp++;
                idx++;
            }
        } else if (rp != arr2.length) {
            while (rp < n) {
                arr[idx] = arr2[rp];
                rp++;
                idx++;
            }
        }
        return arr;
    }

    //Merge Sort Without Extra Space Tc-O(n)
    public static void mergeSort(int arr1[], int arr2[]) {
        int lp = arr1.length - 1, rp = 0;
        while (arr1[lp] > arr2[rp]) {
            swap(arr1, arr2, lp, rp);
            lp--;
            rp++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void swap(int arr1[], int arr2[], int lp, int rp) {
        //swap
        int temp = arr1[lp];
        arr1[lp] = arr2[rp];
        arr2[rp] = temp;
    }

    public static void printArray(int matrix[]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1 ,4 ,8 ,10};
        int arr2[] = {2 ,3 ,9};
        mergeSort(arr1, arr2);
        printArray(arr1);
        System.out.println();
        printArray(arr2);
    }

}