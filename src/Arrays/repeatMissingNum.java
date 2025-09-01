package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class repeatMissingNum {

    //Brute Force
    public static int[] findMissAndRepeatNum(int arr[]){
        int repeatNum=0;
        int missingNum=0;
        for(int i=1; i<=arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(i==arr[j]){
                    count++;
                }
                if(count>=2){
                    repeatNum=i;
                }
            }
            if(count<=0){
                missingNum=i;
            }
        }
        return new int[]{repeatNum, missingNum};
    }



    //Optimal Approch with TC-O(n) & SC-O(n)
    public static int[] findMissingAndRepeatNum(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int repeat = -1;
        int missing = -1;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) >= 2) {
                repeat = arr[i];
            }
        }
        for (int i = 1; i <= arr.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }
        return new int[]{repeat, missing};
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 5, 4, 6, 7, 5};
        System.out.println(Arrays.toString(findMissAndRepeatNum(arr)));
    }
}
