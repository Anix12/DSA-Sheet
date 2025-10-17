package Recurssion;

public class factorial {

    public static int factorialRecur(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecur(n - 1);
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialRecur(n));
    }
}
