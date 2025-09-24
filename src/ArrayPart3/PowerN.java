package ArrayPart3;

public class PowerN {
    //Brute Force Approch
    public static double PowN(double n, int power) {
        double result = 1.0;
        for (int i = 0; i < power; i++) {
            result = result * n;
        }
        return result;
    }

    //Better Approch
    public static double power(double n, int power) {
        return Math.pow(n, power);
    }


    public static void main(String[] args) {
        double n = 2.000;
        int power = 10;
//        System.out.println(PowN(n, power));
        System.out.println(power(2.0, 10));
    }
}
