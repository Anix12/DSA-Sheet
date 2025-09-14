package Cognizant;

import java.util.HashMap;
import java.util.Map;

public class LoanAmountQ14 {

    public static int LessLoanAmouunt(int arr[][]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int MinVal = Integer.MAX_VALUE;
        for (int key[] : arr) {
            for (int k : key) {
                if (k > 0) {
                    map.put(k, map.getOrDefault(k, 0) + 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() < MinVal && entry.getValue() == 1) {
                MinVal = entry.getKey();
            }
        }
        return MinVal;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}, {2, 3}, {1, 3}};
        System.out.println(LessLoanAmouunt(arr));
    }
}
