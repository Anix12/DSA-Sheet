package Arrays;

public class kLargestElement {

    public static int kLargestElementfind(int arr[], int k) {

        int largest = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < k; i++) {
            largest = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > largest) {
                    largest = arr[j];
                    idx = j;
                }
            }
            arr[idx] = Integer.MIN_VALUE;
        }
        return idx;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(kLargestElementfind(nums, k));
    }
}
