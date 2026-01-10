package Strings;

public class ValidPalindromeI {
    //O(n) time and space complexity
    public static boolean isValidPalindromeI(String str) {
        int i = 0,
            j = str.length()-1;

        while (i < j) {
            char left = str.charAt(i);
            char right = str.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }
            if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "race a car";
        System.out.println(isValidPalindromeI(sentence));

    }
}
