package ArrayPart3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityNbythree {

    //Brute Force Approch

    public static ArrayList<Integer> MajorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list =new ArrayList<>();
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
        int arr[] = {2,2};
        System.out.println(MajorityElement(arr));
    }
}
