package Cognizant;

import java.util.HashMap;

public class AnagramProblem {
    //in this we can find the Freq of letter if same then its anagram

    public static void main(String[] args) {
        String str = "aniket";
        String str1 = "twkina";

        HashMap<Character, Integer> freq1 = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!freq1.containsKey(ch)) {
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}
