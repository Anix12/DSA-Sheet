package ArrayPart3;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityNbythree {

    //Brute Force Approch

    public static ArrayList<Integer> MajorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list =new ArrayList<>();
        for (int key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
            if (map.get(key) > arr.length / 3) {
               list.add(key);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int arr[] = {11, 33, 33, 11, 33, 11};
        System.out.println(MajorityElement(arr));
    }
}
