package Cognizant;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Is Not Prime Number ");
        }
    }
}
