package Cognizant;

public class StringToggle {

    public static String toggle(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                s.append(Character.toLowerCase(str.charAt(i)));
            }else{
                s.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return s.toString();
    }


    public static void main(String[] args) {
        String str = "StRinG";
        System.out.println(toggle(str));
    }
}
