package Cognizant;

import java.util.*;

public class LetterAscii {

    public static int AsciiValuewithCharacter(String s, int arr[]) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int key : arr) {
            set.add(key);
        }
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);
            while (num > 0) {
                int temp = num % 10;
                if (set.contains(temp)) {
                    count++;
                    break;
                }
                num /= 10;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String s = "ABCDEFFFFFFFFF";
        int arr[] = {1, 6, 4, 3, 6, 5};
        System.out.println(AsciiValuewithCharacter(s, arr));
    }
}
