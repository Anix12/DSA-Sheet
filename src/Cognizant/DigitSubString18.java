package Cognizant;

public class DigitSubString18 {

    public static int CountSubString(String s) {
        int count = 0;
        boolean isdigitGroup = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (!isdigitGroup) {
                    count++;
                    isdigitGroup = true;
                }
            } else {
                isdigitGroup=false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "a1b2c3d4e5";
        System.out.println(CountSubString(s));
    }
}
