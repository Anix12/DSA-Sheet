package Arrays;

public class StockBuySell {
    //Brute Force Approch
    public static int stockPrice(int arr[]) {
        int maxValu = 0;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[j] - arr[i];
                maxValu = Math.max(maxValu, sum);
            }
        }
        return maxValu;
    }

    //Optimiza Approch


    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stockPrice(arr));
    }
}
