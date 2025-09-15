package Cognizant;

import java.util.*;

public class CharacterFrequencyQ15 {
    //Alphabate Freq
    //Tyachi Freq
    //Maximum time come freq come element
    //if same then i have to return small value from same freq
    public static int FrequCount(String str) {
        int maxfreq = 0;
        int KeyEle = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        //find every Character Occurance
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        //Now find Every character freq Occurance
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (maxfreq == val) {
                KeyEle = Math.min(KeyEle, key);
            }
            if (val > maxfreq) {
                maxfreq = val;
                KeyEle = key;
            }
        }
        return KeyEle;
    }


    public static void main(String[] args) {
        String str = "ACABDDABDCDACFAEGFDA";
        System.out.println(FrequCount(str));
    }

}

