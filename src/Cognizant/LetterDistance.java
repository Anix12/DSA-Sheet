package Cognizant;

public class LetterDistance {

    public static int DistanceTravel(String s) {
        int i = 1;
        int distance = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i - 1);
            distance += Math.abs(ch - ch1);
            i++;
        }
        return distance;
    }

    public static void main(String[] args) {
        String s = "qrty";
        System.out.println(DistanceTravel(s));
    }
}
