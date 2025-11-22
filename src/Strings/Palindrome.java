package Strings;

public class Palindrome {
    //brute Force Approch
    //Time Complexity was O(n) but space Complexity also O(n)
    public static boolean isPalindrome(String str) {
        StringBuilder str1 = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            str1.append(str.charAt(i));
        }
        return str.equals(str1.toString());
    }

    //two pointers Approch with O(n) space and time complexity
    public static boolean isPalindromUsingTwoPointers(String str) {
        int lp = 0, rp = str.length() - 1;
        while(lp<rp){
            if(str.charAt(lp)!=str.charAt(rp)){
                return false;
            }
            rp--;
            lp++;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "levet";
        System.out.println(isPalindromUsingTwoPointers(str));
    }
}
