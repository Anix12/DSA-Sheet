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
    public static int BuySellStockPrice(int price[]) {
        int maxProfit = 0;
        int buyPrice = price[0];
        for (int i = 1; i < price.length; i++) {
            if (buyPrice < price[i]) {
                maxProfit = Math.max(maxProfit, price[i] - buyPrice);
            }
            buyPrice = Math.min(buyPrice, price[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 6, 4, 3, 1};
        System.out.println(BuySellStockPrice(arr));
    }
}
