package ArrayPart3;

public class MaxConsecutiveOnes {

    public static int CountMaxConsectiveOnes(int arr[]) {
        boolean isone = false;
        int count = 1;
        int maxOne = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                isone = true;
            } else {
                isone = false;
            }
            if (isone) {
                count++;
            } else {
                maxOne = Math.max(count, maxOne);
                count = 0;
            }
        }
        return maxOne;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 1};
        System.out.println(CountMaxConsectiveOnes(arr));
    }
}
