package Arrays;

//Q - Return Pair In Sorted Array With Target Sum
public class PairSum {
    //It's Brute Force Approch because Their Time Complexity is O(n2)
    public static int[] pairSumBrute(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{0, 0};
    }
    //It's Optimized Code In Which We Get Time Complexity O(n)
    public static int[] pairSumOptimize(int arr[], int target) {
        int lp = 0, rp = arr.length - 1;
        while (lp < rp) {
            int sum = arr[lp] + arr[rp];
            if (sum == target) {
                return new int[]{arr[lp], arr[rp]};
            } else if (sum > target) {
                rp--;
            } else {
                lp++;
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 26;
        int newarr[] = pairSumOptimize(arr, target);
        System.out.println(newarr[0]);
        System.out.println(newarr[1]);

    }
}
