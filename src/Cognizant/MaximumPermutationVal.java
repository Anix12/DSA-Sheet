package Cognizant;

public class MaximumPermutationVal {


    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    //logic - Remove kar vowel Sagle Then Factorial For Permutation
    public static int maxPermutation(String str[]) {
        int maxleng = 0;
        for (String s : str) {
            String novowel= s.replaceAll("(?i)[aeiou]", "");
            maxleng = Math.max(maxleng, novowel.length());
        }
        return maxleng == 0 ? 0 : factorial(maxleng);
    }

    public static void main(String[] args) {
        String str[] = {"eabccio"};
        System.out.println(maxPermutation(str));

    }
}
