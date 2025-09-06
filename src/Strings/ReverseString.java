package Strings;

public class ReverseString {
    //Brute Force Approch
    public static String ReverseStr(String s) {
        String reverseString = "";
        String word = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
            } else {
                reverseString += reverseWord(word) +" ";
                word = "";
            }
        }
        reverseString += reverseWord(word);
        return reverseString;
    }

    public static String reverseWord(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed;
    }

    public static void main(String[] args) {
        String s = "this is an amazing program";
        System.out.println(ReverseStr(s));
    }
}
