package ArrayPart4;

public class LongestSubArraySumZero {

    public static int LongestSubArray(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == 0) {
                    int count = j - i + 1;
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[] = {1, 3, -5, 6, -2};
        System.out.println(LongestSubArray(arr));
    }
}
