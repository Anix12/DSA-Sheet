package Searching;

public class LinearSearch {

    public static boolean isKeyPresent(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {10, 12, 14, 15, 16, 18, 19};
        int key = 19;
        System.out.println(isKeyPresent(arr, key));
    }
}
