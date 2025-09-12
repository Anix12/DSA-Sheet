package Strings;

public class LongestPalindrome {
    public static boolean isPalindrome(String str, int i, int j) {

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "kabab";
        int max = 0, start = 0, end = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str, i, j)) {
                    if (max < (j - i + 1)) {
                        max = j - i + 1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        System.out.println(str.substring(start, end+1));
    }
}
