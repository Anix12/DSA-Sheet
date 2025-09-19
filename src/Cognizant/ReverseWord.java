package Cognizant;

public class ReverseWord {
    public static String ReverseWords(String str) {
        StringBuilder str1 = new StringBuilder();
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                str1.append(words[i].charAt(j));
            }
            str1.append(" ");
        }
    return str1.toString();
    }

    public static void main(String[] args) {
        String str = "Aniket Adhav";
        System.out.println(ReverseWords(str));
    }
}
