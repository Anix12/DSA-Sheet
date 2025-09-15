package Cognizant;

public class TallestBuildingQ17 {

    public static int TallestBuildingSum(int arr[], int d) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean leftOk = (i - d < 0) || (arr[i] > arr[i - d]);
            boolean rightOk = (i + d >= arr.length) || (arr[i] > arr[i + d]);

            if (leftOk && rightOk) {
                sum += arr[i];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int n = 6;
        int arr[] = {2, 1};
        int d = 1;
        System.out.println(TallestBuildingSum(arr, d));

    }
}
