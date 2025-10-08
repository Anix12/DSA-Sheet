package Cognizant;

public class OddEven {

    public static boolean isOddOrEven(int num) {
        return (num % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isOddOrEven(13));
    }
}
