package Cognizant;

import java.util.*;

public class StringComparisionQ19 {

    public static String StringComparison(String s) {
        int lp = 0;
        int count = 1;
        int rp = 1;
        boolean LastHash = false;
        StringBuilder sb = new StringBuilder();
        while (rp < s.length()) {
            if (s.charAt(lp) == s.charAt(rp)) {
                count++;
                rp++;
            } else {
                if (count >= 2) {
                    if (!LastHash) {
                        sb.append("#");
                    }
                } else {
                    sb.append(s.charAt(lp));
                    LastHash = false;
                }
                count = 1;
                lp = rp;
                rp = lp + 1;
            }
        }
        //last letter sathi
        if (count >= 2) {
            sb.append("#");
        } else {
            sb.append(s.charAt(lp));
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s = "aabbbcccdddefgggh";
        System.out.println(StringComparison(s));
    }
}
