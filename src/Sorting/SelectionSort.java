package Sorting;

public class SelectionSort {
    // Time Complexity of these Selection Sort is O(n2) and Space was Constant
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            if (arr[smallest] != arr[i]) {
                //swap
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
