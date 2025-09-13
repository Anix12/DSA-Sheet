package Cognizant;

public class SubArraySumTriplet {

    public static void main(String[] args) {
        int arr[] = {2,4,2,6,4,8,4,8,4};
        int count=0;
        int left = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[left] + arr[i] == arr[i - 1]) {
                count++;
            }
            left++;
        }
        System.out.println(count);
    }
}
