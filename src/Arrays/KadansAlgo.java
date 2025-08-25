package Arrays;

public class KadansAlgo {
    //Brute Force approch
    public static int maxSumSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    //Better Force Approch
    public static int betterMaxSumArr(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            maxSum=Math.max(maxSum, sum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(betterMaxSumArr(arr));
    }
}
