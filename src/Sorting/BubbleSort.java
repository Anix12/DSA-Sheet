package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 9, 4, 3, 2};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    // Pass 1: [1, 5, 4, 3, 2, 9]
    // Pass 2: [1, 4, 3, 2, 5, 9]
    // Pass 3: [1, 3, 2, 4, 5, 9]
    // Pass 4: [1, 2, 3, 4, 5, 9]
    // Pass 5: [1, 2, 3, 4, 5, 9]

    }
}
