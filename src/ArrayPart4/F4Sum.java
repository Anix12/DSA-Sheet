package ArrayPart4;

import java.util.*;

public class F4Sum {

    public static ArrayList<ArrayList<Integer>> findTarget(int arr[], int target) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length; ) {
                int p = j + 1, q = arr.length - 1;
                while (p < q) {
                    ArrayList<Integer> sublist = new ArrayList<>();
                    long sum = arr[i] + arr[j];
                    sum += arr[p] + arr[q];
                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        sublist.add(arr[i]);
                        sublist.add(arr[j]);
                        sublist.add(arr[p]);
                        sublist.add(arr[q]);
                        list.add(sublist);
                        p++;
                        q--;
                        while (p < q && arr[p] == arr[p - 1]) p++;
                    }
                }
                j++;
                while (j < arr.length && arr[j] == arr[j - 1]) j++;
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int arr[] = {-2, -1, -1, 1, 1, 2, 2};
        System.out.println(findTarget(arr, 0));
    }
}
