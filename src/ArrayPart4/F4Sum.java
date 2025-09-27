package ArrayPart4;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class F4Sum {
    //Brute Force
    public static Set findTarget(int arr[], int target) {
        Set<ArrayList<Integer>> list = new HashSet<>();
        for (int i = 0; i < arr.length-3; i++) {
            for (int j = i + 1; j < arr.length-2; j++) {
                for (int k = j + 1; k < arr.length-1; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        ArrayList<Integer> list1 = new ArrayList<>();
                        int total = arr[i] + arr[j] + arr[k] + arr[l];
                        if (total == target) {
                            list1.add(arr[i]);
                            list1.add(arr[j]);
                            list1.add(arr[k]);
                            list1.add(arr[l]);
                            list.add(list1);
                        }
                    }
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int arr[] = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};

        System.out.println(findTarget(arr, 9));
    }
}
