package Cognizant;

public class StringHypenQ1 {

    public static String hypenString(String str) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';

            if (arr[idx] == 0) {
                arr[idx] = i + 1;
            }

            if(i>0){
                sb.append('-');
            }

            int repeatCount=arr[idx];
            for(int j=0; j<repeatCount; j++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abcaba";
        System.out.println(hypenString(str));
    }
}
