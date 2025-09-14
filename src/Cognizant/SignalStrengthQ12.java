package Cognizant;

public class SignalStrengthQ12 {


    public static int[] SignalStreng(int arr[], int arr1[]) {
        int count = 0;
        arr1[0] = (arr[0] < arr[arr.length - 1] ? 1 : 0) + (arr[0] < arr[1] ? 1 : 0);
//        if (arr[0] < arr[arr.length - 1]) {
//            count++;
//        }
//        if (arr[0] < arr[1]) {
//            count++;
//        }
//        arr1[0] = count;
        count = 0;
//        if (arr[arr.length - 1] < arr[0]) {
//            count++;
//        }
//        if (arr[arr.length - 1] < arr[arr.length - 2]) {
//            count++;
//        }
//        arr1[arr.length - 1] = count;
        arr1[arr.length - 1] = (arr[arr.length - 1] < arr[0] ? 1 : 0) + (arr[arr.length - 1] < arr[arr.length - 2] ? 1 : 0);
        for (int i = 1; i < arr.length - 1; i++) {
            count = 0;
            if (arr[i] < arr[i + 1]) {
                count++;
            }
            if (arr[i] < arr[i - 1]) {
                count++;
            }
            arr1[i] = count;
        }
        return arr1;
    }


    public static void main(String[] args) {
        int arr[] = {10, 15, 12, 9, 14};
        int arr1[] = new int[arr.length];
        SignalStreng(arr, arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
