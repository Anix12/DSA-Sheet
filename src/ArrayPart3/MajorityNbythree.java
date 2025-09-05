package ArrayPart3;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MajorityNbythree {

    //Brute Force Approch
    public static List<Integer> MajorElement(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty() || list.get(0) != arr[i]) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if(count>arr.length/3){
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }


    //Better Approch
    public static ArrayList<Integer> MajorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 3) {
                list.add(entry.getKey());
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(MajorElement(arr));
    }
}
