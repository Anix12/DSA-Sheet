package Sorting;

public class QuickSort {

    public static int partation(int arr[], int low, int high) {
        int privot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < privot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = privot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIdx = partation(arr, low, high);

            quickSort(arr, low, pIdx - 1);
            quickSort(arr, pIdx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 5, 4, 7, 3, 2};
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        //print
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
